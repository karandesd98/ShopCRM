package com.example.ShopCRM.utilityAndSecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**") // Match all endpoints
	                .allowedOrigins("http://localhost:3000/") // Your frontend's URL
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
	                .allowedHeaders("*") // Allow all headers
	                .allowCredentials(true); // Allow cookies or Authorization headers
	    }
}
