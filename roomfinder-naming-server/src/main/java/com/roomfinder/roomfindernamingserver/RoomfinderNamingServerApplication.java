package com.roomfinder.roomfindernamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RoomfinderNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomfinderNamingServerApplication.class, args);
	}

}
