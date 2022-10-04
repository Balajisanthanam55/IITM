package com.jwt.jwtauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping({ "/password" })
    public String welcomePage() {
        return "your  password is balaji730";
    }
}