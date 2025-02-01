package com.xworkz.gym.controller;

import com.xworkz.gym.dto.UserLoginDTO;
import com.xworkz.gym.entity.RegistrationEntity;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
@Slf4j
public class UserLoginController {
    @Autowired
    public GymService gymService;

    UserLoginController() {
        log.info("No-arg const in UserLoginController");
    }

    @GetMapping("/UserLogin")
    public String onLogin() {
        return "UserLogin";
    }

    @PostMapping("/user")
    public String userLogin(@RequestParam String email, @RequestParam String password, Model model) {
        System.out.println("userLogin in controller=============");
        RegistrationEntity display = gymService.userSave(email, password);
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
                System.out.println("Redirecting to Success page.");
                String name = display.getName();
                model.addAttribute("userName", name);
                //model.addAttribute("filePath",userEntity.getFilePath());
                return "UserSuccess";
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
}
