package com.xworkz.gym.controller;

import com.xworkz.gym.dto.EnquiryDTO;
import com.xworkz.gym.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EnquiryController {

    @Autowired
    public GymService gymService;

    EnquiryController(){
        System.out.println("No-arg const in EnquiryController");
    }

    @PostMapping("/enquiry")
    public String enquired(EnquiryDTO enquiryDTO){
        boolean display = gymService.enquirySave(enquiryDTO);
        if(display){
            return "Intermediate.jsp";
        }else{
            return "Enquiry.jsp";
        }
    }
}
