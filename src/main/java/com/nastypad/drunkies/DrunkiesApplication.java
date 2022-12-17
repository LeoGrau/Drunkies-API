package com.nastypad.drunkies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class DrunkiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrunkiesApplication.class, args);
	}

}
