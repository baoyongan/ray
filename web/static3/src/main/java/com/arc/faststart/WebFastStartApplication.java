package com.arc.faststart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.arc.faststart.mapper")
public class WebFastStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFastStartApplication.class, args);
    }

    @RequestMapping("/info")
    public String hello() {
        return "HELLO";
    }
}
