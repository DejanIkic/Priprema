package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController

public class MyController implements WebMvcConfigurer {


    @PostMapping("/endpoint")
    public ResponseEntity<String> handlePostRequest(@RequestBody String requestBody) {
        System.out.print("The function has been called.\n");

        // Process the request body and perform necessary operations

        // Create the response body
        String responseBody = "Success";

        // Set the desired status code and return the response with the body
        return ResponseEntity.ok(responseBody);
    }

}
