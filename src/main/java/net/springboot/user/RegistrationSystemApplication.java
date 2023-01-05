package net.springboot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "net.springboot.user")
//@ComponentScan(basePackages = {"net.springboot.user.web" + "net.springboot.user.repository" + "net.springboot.user.service" + "net.springboot.user.web.dto"})
public class RegistrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationSystemApplication.class, args);
	}
}
