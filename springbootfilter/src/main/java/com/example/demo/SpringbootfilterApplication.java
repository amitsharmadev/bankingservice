package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.filters.ReqLoggingFilter;
import com.example.demo.filters.TransactionFilter;

@SpringBootApplication
public class SpringbootfilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfilterApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean<TransactionFilter> getTransaction(){
		FilterRegistrationBean<TransactionFilter> filter=
				new FilterRegistrationBean<TransactionFilter>();
		TransactionFilter rf=new TransactionFilter();
		filter.addUrlPatterns("/demo/*");
		filter.addUrlPatterns("/products/*");
		
		filter.setFilter(rf);
		return filter;
	}

	
	@Bean
	public FilterRegistrationBean<ReqLoggingFilter> getRequestLogger(){
		FilterRegistrationBean<ReqLoggingFilter> filter=
				new FilterRegistrationBean<ReqLoggingFilter>();
		ReqLoggingFilter rf=new ReqLoggingFilter();
		filter.addUrlPatterns("/products/*");
		filter.setFilter(rf);
		return filter;
	}

	
	
}
