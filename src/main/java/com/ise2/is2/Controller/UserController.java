package com.ise2.is2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @GetMapping("/register")
    public String getMethodName() {
        return "registerpage";
    }
    
}
