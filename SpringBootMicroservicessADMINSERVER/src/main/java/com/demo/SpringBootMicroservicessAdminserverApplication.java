package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMicroservicessAdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicessAdminserverApplication.class, args);
	}

}