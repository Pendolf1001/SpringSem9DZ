package com.example.Sem9DZ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class Sem9DzApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sem9DzApplication.class, args);
	}




	@Bean
	public RouteLocator customeRouteLocator (RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route("Tasks", r->r.path("/tasks/**")
						.uri("http://localhost:8081/"))
				.route("Notes", r->r.path("/notes/**")
						.uri("http://localhost:8082/")).build();
	}
}
