package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hbl on 2018/5/22.
 */
@RestController
public class indexController {

    @RequestMapping("/index")
    public String indexTest(){
        return  "index" ;
    }
}