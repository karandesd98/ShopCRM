package com.example.ShopCRM.utilityAndSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.ShopCRM.utilityAndSecurity.JWTutility.JwtAuthenticationEntryPoint;
import com.example.ShopCRM.utilityAndSecurity.JWTutility.JwtAuthenticationFilter;



@Configuration
public class SecurityConfig {
	
	@Autowired
	private JwtAuthenticationEntryPoint point;
	@Autowired
	private JwtAuthenticationFilter filter;
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	        http.csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> auth.requestMatchers("/home/**").authenticated()
	                		                           .requestMatchers("/auth/login").permitAll()
	                		                           .requestMatchers("/welcome").permitAll()
	                		                           .anyRequest().authenticated())
	            
	               
	                
	            .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
	            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
	       http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
	        return http.build();
	    }
	 
	    @Bean
	    public UserDetailsService userDetailsService() {
	     /*   UserDetails userDetails = User.builder().
	                username("sachin")
	                .password(passwordEncoder().encode("123")).roles("ADMIN").
	                build();
	        return new InMemoryUserDetailsManager(userDetails);  */
			
			return new customeUserDetailServiceImpl();
	    }
	 
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	    
	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
	        return builder.getAuthenticationManager();
	    }

}
