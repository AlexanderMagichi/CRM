package com.myproject.crm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication(scanBasePackages = {"your.base.package", "com/myproject/crm/demo/repositories"})

public class CrmApplication {


	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}

}
