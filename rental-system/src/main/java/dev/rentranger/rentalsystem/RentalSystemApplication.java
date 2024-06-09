package dev.rentranger.rentalsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "dev.rentranger.rentalsystem.repository")
@EntityScan(basePackages = "dev.rentranger.rentalsystem.entity")
public class RentalSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(RentalSystemApplication.class, args);
	}
}
