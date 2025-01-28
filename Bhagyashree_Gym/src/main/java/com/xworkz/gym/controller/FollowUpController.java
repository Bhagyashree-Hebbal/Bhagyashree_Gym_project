package com.xworkz.gym.controller;

import com.xworkz.gym.constants.StatusEnum;
import com.xworkz.gym.dto.FollowUpDTO;
import com.xworkz.gym.dto.FollowUpViewDTO;
import com.xworkz.gym.entity.EnquiryEntity;
import com.xworkz.gym.entity.FollowUpViewEntity;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class FollowUpController {

    @Autowired
    public GymService gymService;

    FollowUpController() {
        System.out.println("No-arg const in FollowUpController");
    }

    @GetMapping("/search")
    public String followUping(@RequestParam(value = "status", required = false) String status, Model model) {
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
    public String onFollowUpUpdate(@RequestParam String name, @RequestParam String status, @RequestParam String reason, Model model) {
        System.out.println("============update==========");
        System.out.println(name);
        boolean saved = gymService.updateStatusAndReason(name, status, reason);

        System.out.println("update method------------------");
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

    @PostMapping("/saveview")
    public String saveView(FollowUpViewDTO followUpViewDTO){
        boolean display = gymService.saveView(followUpViewDTO);
        if (display) {
            return "Intermediate";
        } else {
            return "ViewPage";
        }
    }
    @GetMapping("/view")
    public String viewPage(@RequestParam int enquiryId, Model model) {
        System.out.println("=================================");
        List<FollowUpViewEntity> enquiryList = gymService.getAllFollowup(enquiryId);
        System.out.println("viewDetails in controller======"+enquiryList);
        model.addAttribute("enquiryList",enquiryList);
            return "ViewPage";

    }

//    @GetMapping("/viewDetails")
//    public String viewDetails(@RequestParam int id, Model model){
//        List<ViewDetailsEntity> data=gymService.getAllData(id);
//        System.out.println("viewDetails in controller======"+data.toString());
//
//        model.addAttribute("data",data);
//        return "ViewDetails";
//    }


//    @PostMapping("/updateFollowUp")
//    public String updateFollowUp(@RequestParam("enquiryId") int enquiryId,
//                                 @RequestParam("reason") String reason) {
//        gymService.updateFollowUp(enquiryId, reason);
//        return "redirect:/view";
//    }
}
