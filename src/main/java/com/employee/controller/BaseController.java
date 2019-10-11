package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@CrossOrigin
public class BaseController {
	
	@RequestMapping(value = "/{[path:[^\\.]*}")
    public String redirect() {
        return "forward:/index.html";
    } 
}
