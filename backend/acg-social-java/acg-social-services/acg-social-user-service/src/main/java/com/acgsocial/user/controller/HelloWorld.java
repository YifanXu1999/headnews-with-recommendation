package com.acgsocial.user.controller;

import com.acgsocial.common.result.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloWorld {


    @GetMapping("/a")
    public ResponseResult<String> hello(Authentication authentication) {
        log.info("Authentication: {}", authentication);
        System.out.println("Hello World");
        return ResponseResult.success("Hello World");
    }





}
