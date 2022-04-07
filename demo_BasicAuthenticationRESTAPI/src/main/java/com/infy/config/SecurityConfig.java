package com.infy.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Registering in-Memory authentication credentials for users
		
	   auth.inMemoryAuthentication()
			.withUser("smith")
			.password("{noop}smith123").roles("ADMIN")
			.and()
			.withUser("tim")
			.password("{noop}tim123").roles("USER");
	}
	
	protected void configure(HttpSecurity http) throws Exception{
			   http
			     .authorizeRequests()
			      .antMatchers("/customers/**")
			      .hasRole("ADMIN")
			    .anyRequest()
			    .authenticated()
			    .and()
			    .httpBasic();
			   http.csrf().disable();
			}

	}

