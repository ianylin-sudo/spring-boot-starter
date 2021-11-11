package com.lambertylin.springlogging.controllers;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  Logger logger = LogManager.getLogger(IndexController.class);

  @GetMapping(value = "/welcome")
  public ResponseEntity<Object> welcome() {
    logger.info("/welcome is here");
    Map<String, String> response = new HashMap<>();
    response.put("msg", "Hello World");
    return ResponseEntity.ok(response);
  }
}
