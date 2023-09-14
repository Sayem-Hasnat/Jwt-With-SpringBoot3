package com.hasnat.JwtWithSpringBoot3.controller;

import com.hasnat.JwtWithSpringBoot3.dto.User;
import com.hasnat.JwtWithSpringBoot3.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    //http://localhost:8080/home/user

    @GetMapping("/user")
    public List<User> getUser(){
        System.out.printf("Getting Users");
        return this.userService.getUser();
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }


}
