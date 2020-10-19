package com.oracle.jenkintest.jenkinfiledemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkin")
public class Controller {

    @GetMapping("/demo")
    public String Sample()
    {
        return "Welcome to jenkin";
    }
}
