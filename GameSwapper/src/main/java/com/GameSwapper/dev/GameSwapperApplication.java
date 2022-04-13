package com.GameSwapper.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GameSwapperApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GameSwapperApplication.class, args);
	}

}
