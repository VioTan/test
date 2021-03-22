package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类中的所有方法返回的数据直接写给浏览器（如果是对象转为json对象）
/*@ResponseBody
@Controller*/
/*代替上面两个注解*/
@RestController
public class HelloController {

   /* @ResponseBody*/
    @RequestMapping("/hello")
    public  String hello(){
        return  "Hello Word quick!";
    }
}
