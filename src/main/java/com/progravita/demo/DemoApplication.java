package com.progravita.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
			.ignoreIfMalformed()
			.ignoreIfMissing().load();
		System.out.println("Initializing on " + dotenv.get("APP_DEBUG") + " with jdbc:mysql://" + dotenv.get("DB_HOST") + ":" + dotenv.get("DB_PORT") + "/" + dotenv.get("DB_DATABASE") + "?useSSL=false&serverTimezone=UTC");
		SpringApplication.run(DemoApplication.class, args);
	}

}
