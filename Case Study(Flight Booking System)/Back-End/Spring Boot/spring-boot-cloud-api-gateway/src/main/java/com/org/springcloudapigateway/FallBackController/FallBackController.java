package com.org.springcloudapigateway.FallBackController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    
	@HystrixCommand
	@RequestMapping("/flightFallBack")
	public Mono<String> flightManagementFallBack() {
		return Mono.just("Flight Management Service is taking too long to respond or is down. Please try again later");
	}

	@HystrixCommand
	@RequestMapping("/fareFallback")
	public Mono<String> fareManagementFallBack() {
		return Mono.just("Fare Management Service is taking too long to respond or is down. Please try again later");
	}

	@HystrixCommand
	@RequestMapping("/bookingFallback")
	public Mono<String> bookingManagementFallBack() {
		return Mono.just("Booking Management Service is taking too long to respond or is down. Please try again later");
	}
	
	@HystrixCommand
	@RequestMapping("/loginFallback")
	public Mono<String> loginFallback() {
		return Mono.just("Login Service is taking too long to respond or is down. Please try again later");
	}
	
	@HystrixCommand
	@RequestMapping("/registrationFallback")
	public Mono<String> registrationFallback() {
		return Mono.just("Registration Service is taking too long to respond or is down. Please try again later");
	}


}
