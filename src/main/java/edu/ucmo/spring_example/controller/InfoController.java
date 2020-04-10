package edu.ucmo.spring_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {

    @RequestMapping(value = "/InformationalSessions")
    public String informationalSessions() {
        return "test";
    }

}
