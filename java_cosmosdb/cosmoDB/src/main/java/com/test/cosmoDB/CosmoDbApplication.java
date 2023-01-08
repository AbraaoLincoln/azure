package com.test.cosmoDB;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCosmosRepositories(basePackages = "com.test.cosmoDB.repository")
public class CosmoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmoDbApplication.class, args);
	}

}
