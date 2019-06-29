package ks.com.springtemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String mainPage(){
    return "Spring 5 Template Start!!";
  }

}
