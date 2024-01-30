package com.jpabook02.jpashop02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; // 화면 이름, .html이 자동으로 붙음
    }
}

/**
 * Model의 역할
 * data를 실어서 view에 넘길 수 있다.
 */
