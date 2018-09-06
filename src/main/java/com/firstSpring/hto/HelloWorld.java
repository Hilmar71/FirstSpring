package com.firstSpring.hto;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {

    @RequestMapping("/")

    public String index() {


        String s = "Hello world Hilmar";
        return s;

    }

}
