package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.cloud"})
public class Spring0309Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring0309Application.class, args);
	}

}
