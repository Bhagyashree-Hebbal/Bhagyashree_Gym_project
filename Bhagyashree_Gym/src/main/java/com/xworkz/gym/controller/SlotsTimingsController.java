package com.xworkz.gym.controller;

import com.xworkz.gym.entity.SlotTimingsEntity;
import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
@Slf4j
public class SlotsTimingsController {
    @Autowired
    GymService gymService;

    SlotsTimingsController(){
        System.out.println("Created the SlotTimings NoArgs Constructor");
    }


    @GetMapping("/AddSlotact")
    public String onSlots(@RequestParam("startTimings") String startTimings, @RequestParam("endTimings") String endTimings,
                          @RequestParam("duration") String duration,
                          Model model) {
        boolean saved = gymService.saveSlots(startTimings, endTimings, duration);
        if (saved) {
            model.addAttribute("successMessage", "DetailsUpdatedSuccessfully");
            List<SlotTimingsEntity> slots = gymService.getAllSlots();
            model.addAttribute("slots", slots);
            return "SlotsTrainers";
        }
        model.addAttribute("errorMessage", "Failed ");
        return "SlotsTrainers";
    }

}
