package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/endpoint")
    public String handlePostRequest(@RequestBody String requestBody) {
        // Process the request body and perform necessary operations
        // Return a response or perform any other actions

        return "Success";
    }
}
