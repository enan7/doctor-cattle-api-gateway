//package com.doctorcattle.apigateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringCloudConfig {
//
//	  @Bean
//	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//	        return builder.routes()
//	                .route(r -> r.path("/api/customer-service/**")
//	                        .uri("https://doctor-cattle-customer-service.herokuapp.com/")
//	                        )
//
//	                .route(r ->r.path("/api/cattle-service/**")
//	                        .uri("https://doctor-cattle-cattle-service.herokuapp.com/")
//	                        )
//	                .build();
//	    }
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	 }
