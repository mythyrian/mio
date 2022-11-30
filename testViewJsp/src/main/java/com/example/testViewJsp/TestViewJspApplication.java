package com.example.testViewJsp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Actor;


@SpringBootApplication
@ComponentScan({"com.example.model"})
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.model")
public class TestViewJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestViewJspApplication.class, args);
	}

}
