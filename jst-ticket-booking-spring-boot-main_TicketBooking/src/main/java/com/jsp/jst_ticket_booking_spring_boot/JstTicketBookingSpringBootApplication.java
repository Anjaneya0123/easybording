package com.jsp.jst_ticket_booking_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients

public class JstTicketBookingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JstTicketBookingSpringBootApplication.class, args);
	}

}
