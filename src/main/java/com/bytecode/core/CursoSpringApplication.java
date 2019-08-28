package com.bytecode.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()

public class CursoSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CursoSpringApplication.class, args);
	}

}
