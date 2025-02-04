package com.xworkz.gym.controller;

import com.xworkz.gym.entity.SlotTimingsEntity;
import com.xworkz.gym.entity.TrainerInfoEntity;
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
public class TrainerAllotmentController {
    @Autowired
    GymService gymService;

    TrainerAllotmentController() {
        System.out.println("created the noArgs constructor TrainerAllotmentController");
    }

    @GetMapping("/trainersAllotmentact")
    public String onTrainerManage(Model model) {
        List<SlotTimingsEntity> slots = gymService.getAllSlots();
        model.addAttribute("slots", slots);
        List<TrainerInfoEntity> trainerinfolist = gymService.getAllTrainerDetails();
        model.addAttribute("trainerInfoList", trainerinfolist);
        return "SlotsTrainers";
    }


    @PostMapping("/trainerAddact")
    public String onTrainerAdd(@RequestParam("Name") String name, @RequestParam("phoneNo") long phoneNo,
                               @RequestParam("slotTimings") String slotTimings, Model model) {
        boolean saved = gymService.saveTrainerDetails(name, phoneNo, slotTimings);
        if (saved) {
            List<SlotTimingsEntity> slots = gymService.getAllSlots();
            model.addAttribute("slots", slots);
            List<TrainerInfoEntity> trainerinfolist = gymService.getAllTrainerDetails();
            model.addAttribute("trainerInfoList", trainerinfolist);
            model.addAttribute("successMessage", "DetailsUpdatedSuccessfully");
            return "SlotsTrainers";
        }
        model.addAttribute("errorMessage", "Failed ");
        return "SlotsTrainers";
    }

}
