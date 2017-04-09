package com.example.ratingapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bajtek on 01.04.2017.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public  String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "WEB-INF/pages/home";                                      //// home.jsp
    }
}
