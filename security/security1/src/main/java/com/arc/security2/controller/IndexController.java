package com.arc.security2.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * druid 监控配置
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model) {
        System.out.println("#######");
        return "index.html";
    }


}
