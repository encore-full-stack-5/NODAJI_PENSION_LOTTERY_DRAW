package com.example.nodaji_pension_draw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NodajiPensionDrawApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodajiPensionDrawApplication.class, args);
	}

}
