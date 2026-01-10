package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Controller;

@Controller
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

}
