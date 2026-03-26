package org.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cloud.mapper")
public class Spring0326Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring0326Application.class, args);
	}

}
