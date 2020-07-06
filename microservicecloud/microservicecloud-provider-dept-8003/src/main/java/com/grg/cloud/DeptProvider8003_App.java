package com.grg.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.grg.cloud.controller,com.grg.cloud.service"})
//@MapperScan("com.grg.cloud.dao")
@MapperScan( basePackages = "com.grg.cloud.dao")
@EnableEurekaClient
public class DeptProvider8003_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
