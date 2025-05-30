package com.config;

import jakarta.faces.webapp.FacesServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com")
public class WebAppConfig {

	public WebAppConfig() {
		super();
	}

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".xhtml");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		ServletRegistrationBean<FacesServlet> servletRegistrationBean = new ServletRegistrationBean<FacesServlet>(
				servlet, "*.xhtml");
		return servletRegistrationBean;
	}

}
