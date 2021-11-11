package com.lambertylin.springlogging.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "IndexController")
@RestController
public class IndexController {

  Logger logger = LogManager.getLogger(IndexController.class);

  @GetMapping(value = "/greeting")
  @ApiOperation("greeting")
  public ResponseEntity<Object> greeting() {
    logger.info("/greeting is here");
    Map<String, String> response = new HashMap<>();
    response.put("msg", "Hello World");
    return ResponseEntity.ok(response);
  }

}
