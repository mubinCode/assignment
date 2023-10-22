package com.abdullah.webfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WebfeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfeignclientApplication.class, args);
	}

}
