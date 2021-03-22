package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /*接收浏览器hello请求*/
    @ResponseBody
    @RequestMapping("/hellow")
    public  String hello(){
        return  "Hello World!";
    }
}
