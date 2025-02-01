package com.xworkz.gym.controller;

import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j
public class RegistrationController {
    @Autowired
    public GymService gymService;

    RegistrationController() {
        //System.out.println("No-arg const in RegistrationController");
        log.info("RegistrationController no arg const");
    }

    @PostMapping("/registration")
    public String registration(RegistrationDTO registrationDTO) {
        boolean display = gymService.registrationSave(registrationDTO);
        if (display) {
            return "Intermediate";
        } else {
            return "Registration";
        }
    }


}
