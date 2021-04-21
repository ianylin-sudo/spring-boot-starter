package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class SpringStarterApplication {

  // Visit localhost:8080/actuator/health to check service health
  public static void main(String[] args) {
    SpringApplication.run(SpringStarterApplication.class, args);
  }
}
