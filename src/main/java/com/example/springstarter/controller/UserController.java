package com.example.springstarter.controller;

import com.example.springstarter.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "User Controller")
@RestController
@RequestMapping("/user")
public class UserController {

  @ApiOperation("Get user by Id")
  @GetMapping("/{id}")
  public User getUserById(@PathVariable int id) {

    User user = new User();
    user.setId(id);

    return user;
  }
}
