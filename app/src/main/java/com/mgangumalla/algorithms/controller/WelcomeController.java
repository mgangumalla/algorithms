package com.mgangumalla.algorithms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class WelcomeController {
    @GetMapping(value = "/welcome", produces = "application/json")
    public Map<String, String> welcome(HttpServletRequest request, HttpServletResponse response) {

        return Collections.singletonMap("msg", "Hello People");
    }
}
