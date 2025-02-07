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
@RequestMapping("/admin")
@Slf4j
public class AdminRestController {

    @Autowired
    GymService gymService;

    @GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onRegiEmail(@PathVariable String email) {
        log.info("email=" + email);
        Long count = this.gymService.getCountByAdminEmail(email);
        if (count == 0) {
            System.out.println("does not exist");
            return "";
        } else {
            System.out.println("exists");
            return "";
        }
    }

    @GetMapping(value = "/password/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAdminPassword(@PathVariable String password) {
        log.info("Password is=" +password);
        Long count = this.gymService.getCountByAdminPassword(password);
        if (count == 0) {
            System.out.println("Password does not exist");
            return "Enter valid password";
        } else {
            System.out.println("Password is exists");
            return "";
        }
    }

}
