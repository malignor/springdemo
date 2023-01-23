package com.malignor.example.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableScheduling
public class SpringdemoApplication {

	public static void main(String[] args) {
		run(SpringdemoApplication.class, args);
	}

}
