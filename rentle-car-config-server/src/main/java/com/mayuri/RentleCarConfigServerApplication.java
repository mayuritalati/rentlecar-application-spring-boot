package com.mayuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RentleCarConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentleCarConfigServerApplication.class, args);
	}

}
