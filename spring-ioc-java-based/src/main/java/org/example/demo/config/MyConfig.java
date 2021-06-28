package org.example.demo.config;

import java.util.ArrayList;

import org.example.demo.pojo.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.example" })
public class MyConfig {
	
	@Bean
	public ArrayList<Account> list()
	{
		return new ArrayList<Account>();
	}

}