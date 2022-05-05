package com.example.springstarter.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Check API docs on
 * 
 * /swagger-ui.html
 * /swagger-ui/**
 * /swagger-resources/**
 * /v2/api-docs
 * /v3/api-docs
 */
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.OAS_30)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Swagger 3 API Documentation")
        .description("Spring Boot integrated with Swagger 3 Example")
        .contact(new Contact("Yan Lin", "https://github.com/lin3yx", "linyan.work@gmail.com"))
        .version("0.0.1")
        .build();
  }
}
