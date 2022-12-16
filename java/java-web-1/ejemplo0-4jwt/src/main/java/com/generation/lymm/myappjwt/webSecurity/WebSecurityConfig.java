package com.generation.lymm.myappjwt.webSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManager) throws Exception {
		
		return http
    			.csrf().disable()
    			.httpBasic()//seguridad de http mecanismo de autenticacion basica
    			.and()
    			.authorizeRequests()
    			.requestMatchers( "/publico/**").permitAll()//url que empiecen con publico
    			.requestMatchers( "/admin/**").hasRole("ADMIN")//url que empiesen con admin son del rol admin
    			.anyRequest()
    			.authenticated()    			
    			.and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .build();
    	}
	UserDetailsService userDatailsService() {
		InMemoryUserDetailsManager manager=new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("Pedrovar")
				.password(PasswordEncoder().encoder("2357")
	}
}
