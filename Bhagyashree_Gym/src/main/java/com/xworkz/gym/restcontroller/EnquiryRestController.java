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
@RequestMapping("/")
@Slf4j
public class EnquiryRestController {

    @Autowired
    GymService gymService;

    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onName(@PathVariable String name) {
        System.out.println("name=" + name);
        Long count = this.gymService.getCountByName(name);
        if (count == 0) {
            System.out.println("Name does not exist");
            return "";
        } else {
            System.out.println("Name exists");
            return "";
        }
    }

    @GetMapping(value = "/area/{area}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onArea(@PathVariable String area) {
        System.out.println("area=" + area);
        Long count = this.gymService.getCountByArea(area);
        if (count == 0) {
            System.out.println("Area does not exist");
            return "";
        } else {
            System.out.println("Area exists");
            return "";
        }
    }

    @GetMapping(value = "/phoneNo/{phoneNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onPhone(@PathVariable long phoneNo) {
        System.out.println("phoneNo=" + phoneNo);
        Long count = this.gymService.getCountByPhoneNo(phoneNo);
        if (count == 0) {
            System.out.println("Phone No does not exist");
            return "";
        } else {
            System.out.println("Phone no exists");
            return "";
        }
    }

    @GetMapping(value = "/distance/{distance}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAlterEmail(@PathVariable double distance) {
        System.out.println("distance=" + distance);
        Long count = this.gymService.getCountByDistance(distance);
        if (count == 0) {
            System.out.println("Distance does not exist");
            return "";
        } else {
            System.out.println("Distance exists");
            return "";
        }
    }

    @GetMapping(value = "/age/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAlterPhone(@PathVariable int age) {
        System.out.println("age=" + age);
        Long count = this.gymService.getCountByAge(age);
        if (count == 0) {
            System.out.println("Age does not exist");
            return "";
        } else {
            System.out.println("Age exists");
            return "";
        }
    }

}
