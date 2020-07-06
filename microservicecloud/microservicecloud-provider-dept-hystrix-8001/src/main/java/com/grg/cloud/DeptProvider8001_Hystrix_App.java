package com.grg.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.grg.cloud.controller,com.grg.cloud.service"})
//@MapperScan("com.grg.cloud.dao")
@MapperScan( basePackages = "com.grg.cloud.dao")
@EnableEurekaClient
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}
