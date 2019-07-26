package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RevatureTitaniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevatureTitaniumApplication.class, args);
	}

}
