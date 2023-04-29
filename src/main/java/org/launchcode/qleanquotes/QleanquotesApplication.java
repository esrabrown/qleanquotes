package org.launchcode.qleanquotes;

import models.data.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("models.data")
public class QleanquotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(QleanquotesApplication.class, args);
	}

}
