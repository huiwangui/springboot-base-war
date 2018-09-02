package com.hxjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 项目打war包
 * 1.继承SpringBootServletInitializer
 * 2.覆写configure方法
 */
@SpringBootApplication
public class SpringbootBaseApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootBaseApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBaseApplication.class, args);
	}
}
