package com.slyashenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kate on 18.05.17.
 */
@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }
}
