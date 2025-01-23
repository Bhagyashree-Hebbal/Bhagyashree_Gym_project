package com.xworkz.gym.controller;

import com.xworkz.gym.constants.StatusEnum;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class FollowUpController {

    @Autowired
    public GymService gymService;

    FollowUpController(){
        System.out.println("No-arg const in FollowUpController");
    }

    @GetMapping("/search")
    public String followUping(@RequestParam(value = "status", required = false) String status, Model model){
        List<EnquiryEntity> enquiryList;

        // Fetch filtered or all records
        System.out.println(status);
        if (status != null && !status.isEmpty()) {
            enquiryList = gymService.getEnquiriesByStatus(status); // Add method to filter by status
        } else {
            enquiryList = gymService.getEnquiries();
        }

        model.addAttribute("enquiryList", enquiryList);
        model.addAttribute("statusOptions", Arrays.asList(StatusEnum.values())); // Status options
        model.addAttribute("selectedStatus", status); // Preserve selected status in dropdown

        return "FollowUp";
    }

    @PostMapping("updateFollowUp")
    public String onFollowUpUpdate(@RequestParam String name,@RequestParam String status,@RequestParam String reason,Model model) {
        System.out.println(name);

        boolean saved = gymService.updateStatusAndReason(name, status, reason);
        if (saved) {
            List<EnquiryEntity> enquiryList = gymService.getEnquiries();
            if (enquiryList != null) {
                enquiryList.forEach((n) -> System.out.println(n));
                // session.setAttribute("enquiryList", enquiryList);
                model.addAttribute("enquiryList", enquiryList);
                model.addAttribute("statusOptions", Arrays.asList(StatusEnum.values()));

                return "FollowUp";
            }
        }
        return "FollowUp";
    }

    @GetMapping("/view")
    public String view(String name,long phoneNo){
        System.out.println("================");

        return "ViewPage";
    }
}
