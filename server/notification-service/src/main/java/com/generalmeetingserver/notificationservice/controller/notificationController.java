package com.generalmeetingserver.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class notificationController {
    @GetMapping(name = "/say",value = "/say")
    public String sayHello() {

        return "Hello From Service notification";
    }
}
