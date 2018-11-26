package com;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com" })
@EnableAutoConfiguration
public class MainApp extends SpringBootServletInitializer {

	public MainApp() {
		super();
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApp.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(new Class[] { Main.class});
	}

}
