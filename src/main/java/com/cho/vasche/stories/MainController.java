package com.cho.vasche.stories;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    String getIndex(){
        return "welcome to main page";
    }
}
