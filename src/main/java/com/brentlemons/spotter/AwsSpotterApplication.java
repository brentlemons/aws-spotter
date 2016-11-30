package com.brentlemons.spotter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsSpotterApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(AwsSpotterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsSpotterApplication.class, args);
	}

	@Override
    public void run(String... strings) throws Exception {
		logger.info("started");
    }
}
