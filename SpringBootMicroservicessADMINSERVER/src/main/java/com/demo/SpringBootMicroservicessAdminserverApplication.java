package com.demo;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import java.sql.SQLOutput;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMicroservicessAdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicessAdminserverApplication.class, args);
		System.out.println("Hello World!");
	}

}
