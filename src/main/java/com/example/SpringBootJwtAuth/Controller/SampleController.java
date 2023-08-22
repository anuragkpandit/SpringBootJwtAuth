package com.example.SpringBootJwtAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/sample")
public class SampleController {


    @GetMapping("/test")
    public String getSample(){
        return "Welcome to Sample demo..";
    }

    @GetMapping("/demo")
    public String getSampleDemo(){
        return "Welcome to Sample demo Applications for testing..";
    }

    @GetMapping("/currentUser")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }

}
