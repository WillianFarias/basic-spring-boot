package com.digitalinnovationone.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  
  //ira injetar todos os valores caso o inicio seja $app.message
  @Value("${app.message}")
  private String appMessage;

  @GetMapping("/")
  public String getAppMessage() {
    return appMessage;
  }
}
