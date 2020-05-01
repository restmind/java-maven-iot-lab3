package ua.lviv.iot.airline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories ("ua.lviv.iot.airline.dataaccess")
@ComponentScan ({
		"ua.lviv.iot.airline.controller",
		"ua.lviv.iot.airline.dataaccess",
		"ua.lviv.iot.airline.business" })
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
}
