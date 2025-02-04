package com.xworkz.gym.controller;

import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.entity.RegistrationEntity;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
@Slf4j
public class UpdateController {
    @Autowired
    public GymService gymService;

    UpdateController() {
        System.out.println("No-arg const in UpdateController");
    }

    @PostMapping("/update")
    public String updateRegister(RegistrationDTO registrationDTO, String name, long phoneNo) {
        log.debug("UpdateController ");
        boolean isUpdated = gymService.updateRegistration(registrationDTO, name, phoneNo);
        if (isUpdated) {
            return "Intermediate";
        } else {
            return "RegistrationUpdate";
        }
    }

}

