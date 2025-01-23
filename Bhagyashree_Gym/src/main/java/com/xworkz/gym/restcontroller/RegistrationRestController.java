package com.xworkz.gym.restcontroller;

import com.xworkz.gym.service.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
@Slf4j
public class RegistrationRestController {
    @Autowired
    GymService gymService;

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onRegiName(@PathVariable String name) {
        log.info("name=" + name);
        Long count = this.gymService.getCountByRegiName(name);
        if (count == 0) {
            System.out.println("does not exist");
            return "not exist";
        } else {
            System.out.println("exists");
            return "exists";
        }
    }

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onRegiEmail(@PathVariable String email) {
        log.info("email=" + email);
        Long count = this.gymService.getCountByRegiEmail(email);
        if (count == 0) {
            System.out.println("does not exist");
            return "not exist";
        } else {
            System.out.println("exists");
            return "exists";
        }
    }

    @GetMapping(value = "/phoneNo/{phoneNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onRegiPhone(@PathVariable long phoneNo) {
        log.info("phoneNo=" + phoneNo);
        Long count = this.gymService.getCountByRegiPhoneNo(phoneNo);
        if (count == 0) {
            System.out.println("does not exist");
            return "not exist";
        } else {
            System.out.println("exists");
            return "exists";
        }
    }

    @GetMapping(value = "/gymName/{gymName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onGymName(@PathVariable String gymName) {
        log.info("Gym Name=" + gymName);
        Long count = this.gymService.getCountByGymName(gymName);
        if (count == 0) {
            System.out.println("does not exist");
            return "not exist";
        } else {
            System.out.println("exists");
            return "exists";
        }
    }

    @GetMapping(value = "/gymTrainer/{gymTrainer}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onGymTrainerName(@PathVariable String gymTrainer) {
        log.info("Gym Trainer=" + gymTrainer);
        Long count = this.gymService.getCountByTrainer(gymTrainer);
        if (count == 0) {
            System.out.println("does not exist");
            return "not exist";
        } else {
            System.out.println("exists");
            return "exists";
        }
    }
}
