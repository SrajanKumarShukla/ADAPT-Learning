package com.cg.casestudy.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableHystrix
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cg.casestudy.login"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails(){
		Contact contact = new Contact("Srajan Kumar Shukla","srajanshukla@gmail.com","");
		return new ApiInfo(
				"LOGIN-SERVICE API DOCs",
				"Auto-Generated by Swagger",
				"1.0",
				null,
				contact.getName(),
				null,
				null);
	}
}
