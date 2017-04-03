package com.example.ratingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bajtek on 01.04.2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public  String home() {

        return "home";
    }
}
