package com.example.data_sync_test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test {

    @RequestMapping("/test")
    public String test(){
        System.out.println("访问成功");
        return "===============访问成功===================";
    }
}
