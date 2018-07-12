package com.xudong.controller;

import com.xudong.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("index")
    public String index(){
        testService.save();
        return "lalalla";
    }
}
