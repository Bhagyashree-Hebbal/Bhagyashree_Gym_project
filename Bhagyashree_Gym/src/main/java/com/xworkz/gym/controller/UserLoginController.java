package com.xworkz.gym.controller;


import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.entity.RegistrationEntity;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/")
@Slf4j
public class UserLoginController {
    @Autowired
    public GymService gymService;

//    @Autowired
//    public GymRepository gymRepository;

    UserLoginController() {
        log.info("No-arg const in UserLoginController");
    }

    @GetMapping("/UserLogin")
    public String onLogin() {
        return "UserLogin";
    }

//    @GetMapping("/user")
//    public String userLogins(@RequestParam String email, @RequestParam String password, Model model) {
//        System.out.println("userLogin in controller=============");
//
//        model.addAttribute("register",gymRepository.userSave(email));
//        return "UserProfile";
//    }

        @PostMapping("/user")
        public String userLogin(@RequestParam String email, @RequestParam String password, Model model) {
        System.out.println("userLogin in controller=============");
        RegistrationEntity display = gymService.userSave(email, password);
        System.out.println("login user data :"+display);
        int logInCount;
        if (display != null) {
            logInCount = display.getCount();
            log.info("Login Count:" + logInCount);

            if (logInCount == -1) {
                System.out.println("Redirecting to UpdatePassword page.");
                String name = display.getName();
                model.addAttribute("userName", name);
                System.out.println(name);
                model.addAttribute("msg", "UserSuccess");
                return "ResetPassword";
            } else {
                System.out.println("Redirecting to UserProfile page.");
                String name = display.getName();
                model.addAttribute("userName", name);
                model.addAttribute("register",display);
                model.addAttribute("filePath",display.getFilePath());
                return "UserProfile";
            }

        } else {
            System.out.println("User entity is null. Redirecting to SignIn.");
            model.addAttribute("msg", "User not Success");
            return "UserLogin";
        }
    }


    //Password reset
    @PostMapping("/resetPassword")
    public String setNewPassword(@RequestParam String name,@RequestParam String oldPassword, @RequestParam String newPassword, @RequestParam String confirmPassword) {

        log.info("name==" + name);
        log.info("newPassword==" + newPassword);
        log.info("confirmPassword==" + confirmPassword);

        String msg = gymService.updatePasswordByName(name, oldPassword, newPassword, confirmPassword);

        if ("password updated successfully".equals(msg)) {
            return "UserSuccess";
        } else {
            return "ResetPassword";
        }
    }

    //forget Password
    @PostMapping("/forgetPassword")
    public String forgotPassword(@RequestParam String email,@RequestParam String newPassword,@RequestParam String confirmPassword){
        System.out.println("Received request for resetting password:");
        System.out.println("Email:"+email);
        System.out.println("New Password:" + newPassword);
        System.out.println("ConfirmPassword:" + confirmPassword);

        String response = gymService.resetPasswordByEmail(email,newPassword,confirmPassword);

        if("password updated successfully".equals(response)) {
            return "UserSuccess";
        }else{
            return "ForgetPassword";
        }
    }

    @GetMapping("/update")
    public String onUpdateProfile( @RequestParam int registrationId ,Model model)
    {
        System.out.println("=============================update action+++========");
        RegistrationEntity entity=new RegistrationEntity();
       // registrationId=entity.getRegistrationId();
        System.out.println("Why Id is coming"+registrationId);
        // Validate registrationId
        if (registrationId <= 0) {
            model.addAttribute("error", "Invalid user ID.");
            return "ErrorPage";  // Redirect to an error page if no valid ID is found
        }

        // Fetch user details from service
        List<RegistrationEntity> entities = gymService.getAllRegisteredUserDetailsById(registrationId);
        if (entities != null && !entities.isEmpty()) {
            RegistrationEntity entity1 = entities.get(0); // Get first user
            model.addAttribute("register", entity1);
            model.addAttribute("filePath", entity1.getFilePath());
        } else {
            model.addAttribute("error", "No user found with this ID");
            return "ErrorPage";
        }

        return "UpdateUserProfile";
    }

    @GetMapping("/download")
    public void display(HttpServletResponse response,@RequestParam String filePath) throws  Exception{
        System.out.println("this is image"+filePath);
        response.setContentType("Image/jpg");
        File file = new File("C:\\ProfileImagePath\\" + filePath);
        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        ServletOutputStream outputStream = response.getOutputStream();
        IOUtils.copy(inputStream, outputStream);
        response.flushBuffer();

    }

    @PostMapping("/updateUserProfile")
    public String onUpdating(@RequestParam String name, RegistrationDTO registrationDTO, @RequestParam("picture") MultipartFile multipartFile, Model model) throws IOException {
        System.out.println(name);

        if (multipartFile.isEmpty()) {
            // Add the name to the model to pass it to the Success page
            RegistrationDTO dto = gymService.updateUserProfile(name, registrationDTO,null);
             model.addAttribute("register", name);
                return "UserSuccess";

        }else{
            System.out.println("multipartFile="+multipartFile);
            System.out.println("multipartFile OriginalFileName=="+multipartFile.getOriginalFilename());
            System.out.println("multipartFile=="+multipartFile.getContentType());

            byte[] bytes = multipartFile.getBytes();
            Path path = Paths.get("C:\\ProfileImagePath\\" + name + System.currentTimeMillis() + ".jpg");
            Files.write(path, bytes);
            String filePath = path.getFileName().toString();
            System.err.println("filePath=====" + filePath);

            RegistrationDTO dto = gymService.updateUserProfile(name, registrationDTO,filePath);
                return "UpdateUserProfile";
        }
        //return "UpdateUserProfile";
    }

}
