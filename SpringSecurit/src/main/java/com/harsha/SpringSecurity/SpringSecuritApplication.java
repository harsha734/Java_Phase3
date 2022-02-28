package com.harsha.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.harsha.SpringSecurity.repositories.UsersRepository;


@SpringBootApplication
public class SpringSecuritApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritApplication.class, args);
	}

}
