package com.oracle.jenkintest.jenkinfiledemo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JenkinfiledemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinfiledemoApplication.class, args);
    }

}
