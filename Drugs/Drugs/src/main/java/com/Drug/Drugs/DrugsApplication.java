package com.Drug.Drugs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.Drug.Drugs.exception.CustomException;
import com.Drug.Drugs.models.Drugs;

@SpringBootApplication
@EnableEurekaClient
public class DrugsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugsApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}
