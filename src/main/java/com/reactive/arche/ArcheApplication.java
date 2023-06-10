package com.reactive.arche;

import com.github.javafaker.Faker;
import com.reactive.arche.currency.Currency;
import com.reactive.arche.currency.CurrencyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ArcheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArcheApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CurrencyService service){
		return args -> {
			for (int i = 0; i < 100; i++) {
				Faker faker = new Faker();
				service.save(new Currency(
						faker.currency().name(),
						faker.number().numberBetween(1000000, 2000000),
						faker.number().numberBetween(350, 5000),
						faker.number().numberBetween(10000, 14500)
				)).subscribe();
			}
		};
	}

}
