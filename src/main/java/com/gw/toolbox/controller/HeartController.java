package com.gw.toolbox.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/heart")
public class HeartController {
    private static final Logger logger = LoggerFactory.getLogger(HeartController.class);

    @GetMapping("/beat")
    public String beat() throws Exception {
        return "success";
    }

    
}