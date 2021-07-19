package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hotel;

@SpringBootApplication
public class HotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInfoServiceApplication.class, args);
	}

	@Bean
	public Hotel sagar() {

		return new Hotel(111, "Krishna Sagar", "marathalli");
	}

	@Bean
	public Hotel swagath() {

		return new Hotel(222, "Swagath Grand", "Hyderabad");
	}

	@Bean
	public Hotel nandini() {

		return new Hotel(333, "Nandini Residency", "Hyderabad");
	}

}
