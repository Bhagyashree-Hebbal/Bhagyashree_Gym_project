package com.xworkz.gym.controller;

import com.xworkz.gym.dto.RegistrationDTO;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
            return "Update";
        }
    }

//    @GetMapping("/searchUpdate")
//    public String searchRegistrations(@RequestParam(required = false) String name, @RequestParam(required = false) Long phoneNo, Model model) {
//        log.debug("Searching registrations for name: {} and phoneNo: {}", name, phoneNo);
//
//        // Fetch the results based on the search criteria
//        List<RegistrationDTO> results = gymService.searchByNameAndPhoneNo(name, phoneNo);
//
//        // Add search parameters and results to the model
//        model.addAttribute("name", name); // Prepopulate the search form
//        model.addAttribute("phoneNo", phoneNo);
//        model.addAttribute("results", results);
//
//        // Return the name of the JSP
//        return "searchForm";
//    }


}

