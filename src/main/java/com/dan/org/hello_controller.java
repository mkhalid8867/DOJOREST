package com.dan.org;

/**
 * Created by elm on 3/21/17.
 */

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hello_controller {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
