package com.rexdev.micorservice.item.microserviceitem;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  @Bean("clienteRest")
  @LoadBalanced
  public RestTemplate clienteRest() {
    return new RestTemplate();
  }



}
