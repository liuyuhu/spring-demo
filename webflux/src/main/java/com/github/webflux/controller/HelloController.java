package com.github.webflux.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyuhu
 * @date 2018/5/16 下午5:04
 */

@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/index")
    public String index() {
        return "hello world";
    }

}
