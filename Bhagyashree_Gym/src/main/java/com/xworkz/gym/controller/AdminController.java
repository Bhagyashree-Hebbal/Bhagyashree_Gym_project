package com.xworkz.gym.controller;

import com.xworkz.gym.dto.AdminDTO;
import com.xworkz.gym.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    public GymService gymService;

    AdminController() {
        System.out.println("No-arg const in AdminController");
    }

//    @PostMapping("/admin")
//    public String adminLogin(AdminDTO adminDTO, Model model) {
//        boolean display = gymService.save(adminDTO);
//        if (display) {
//            model.addAttribute("msg", "AdminSuccess");
//            return "AdminSuccess.jsp";
//        } else {
//            model.addAttribute("msg", "Admin not Success");
//            return "AdminLogin.jsp";
//        }
//    }

    @GetMapping("/admin")
    public String adminLogin(String email,String password, Model model) {
        boolean read = gymService.getValue(email,password);
        if (read) {
            model.addAttribute("msg", "AdminSuccess");
            return "AdminSuccess";
        } else {
            model.addAttribute("msg", "Admin not Success");
            return "AdminLogin";
        }
    }

}
