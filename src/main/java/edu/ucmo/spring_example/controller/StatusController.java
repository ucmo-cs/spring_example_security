package edu.ucmo.spring_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StatusController {

    @RequestMapping(value = "/status")
    public String status(HttpServletRequest request) {
        System.out.println(request.getRemoteUser());
        return "status";
    }
}
