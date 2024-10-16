package com.santander.bank.santanderbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.santander.bank.santanderbank.controller"})
public class SantanderbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderbankApplication.class, args);
		System.out.println("Hello Jesus! You are VERY WELCOME HERE");
	}

}
