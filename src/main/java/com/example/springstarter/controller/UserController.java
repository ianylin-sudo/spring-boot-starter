package com.example.springstarter.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "User related APIs")
@RequestMapping("/user")
public class UserController {

  //  @PostMapping("/")
  //  @ApiOperation("添加用户的接口")
  //  @ApiImplicitParams({
  //    @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
  //    @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
  //  })
  //  public RespBean addUser(String username, @RequestParam(required = true) String address) {
  //
  //    return new RespBean();
  //  }
  //
  //  @GetMapping("/")
  //  @ApiOperation("根据id查询用户的接口")
  //  @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
  //  public User getUserById(@PathVariable Integer id) {
  //
  //    User user = new User();
  //
  //    user.setId(id);
  //
  //    return user;
  //  }
  //
  //  @PutMapping("/{id}")
  //  @ApiOperation("根据id更新用户的接口")
  //  public User updateUserById(@RequestBody User user) {
  //
  //    return user;
  //  }
}
