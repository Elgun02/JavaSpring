package com.example.lesson_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")  // xml файл находися в папке "resources"
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		for (int i = 0; i < 4; i++) {
			context.getBean(Person.class);
		}
	}
}
