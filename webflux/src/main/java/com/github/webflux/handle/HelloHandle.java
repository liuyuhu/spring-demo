package com.github.webflux.handle;

import com.github.webflux.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author liuyuhu
 * @date 2018/5/16 下午5:24
 */

@RestController
@RequestMapping("/handle")
public class HelloHandle {

    @GetMapping("/hello")
    public Mono hello() {
        return Mono.just("hello world");
    }

    @GetMapping("/user")
    public Mono user() {
        User user = new User()
                .setUserName("lisi")
                .setCompany("gaofeishi");
        return Mono.justOrEmpty(user);
    }

}
