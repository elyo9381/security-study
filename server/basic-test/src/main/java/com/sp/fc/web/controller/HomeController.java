package com.sp.fc.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String index(){
        return "홈페이지 입니다.";
    }

    @GetMapping("/auth")
    public Authentication auth(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/user")
    public SecurityMessage user(){
        return SecurityMessage.builder()
                .auth(SecurityContextHolder.getContext().getAuthentication())
                .message("User 정보")
                .build();
    }


    @GetMapping("/admin")
    public SecurityMessage admin(){
        return SecurityMessage.builder()
                .auth(SecurityContextHolder.getContext().getAuthentication())
                .message("User 정보")
                .build();
    }
}