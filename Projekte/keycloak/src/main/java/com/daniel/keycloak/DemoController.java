package com.daniel.keycloak;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {


    @GetMapping
    @PreAuthorize("hasRole('client:user')")
    public String hello(){
        return "Hello from Keycloack";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('client:admin')")
    public String hello2(){
        return "Hello from Keycloack - ADMIN";
    }
}
