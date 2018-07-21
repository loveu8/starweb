package com.star.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.star.web.service.RunRaceService;
import com.star.web.service.RunRaceServicelmpl;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.star.web.controller"})
public class Application {

  static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  @Bean
  public RunRaceService runRaceService() {
    return new RunRaceServicelmpl();
  }

}
