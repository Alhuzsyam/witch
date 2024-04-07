package com.witch.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }
}
