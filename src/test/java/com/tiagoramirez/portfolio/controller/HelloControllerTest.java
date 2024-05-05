package com.tiagoramirez.portfolio.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class HelloControllerTest {

  @Autowired
  private HelloController controller;

  @Test
  void sayHelloShouldReturnHappyHello() {
    ResponseEntity<String> response = controller.sayHello();
    assertEquals("Hello! :D", response.getBody());
    assertEquals(HttpStatus.OK, response.getStatusCode());
  }
}
