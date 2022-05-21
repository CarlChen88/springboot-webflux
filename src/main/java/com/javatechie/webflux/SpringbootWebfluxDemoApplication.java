package com.javatechie.webflux;

import com.javatechie.webflux.config.EnableConfigurationImport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigurationImport
public class SpringbootWebfluxDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootWebfluxDemoApplication.class, args);
	}

}
