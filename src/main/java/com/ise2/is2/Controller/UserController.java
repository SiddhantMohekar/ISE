package com.ise2.is2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class UserController {
    
    @GetMapping("/register")
    public String getMethodName(@PathVariable int id) {
        return "/Register";
    }
    
}
