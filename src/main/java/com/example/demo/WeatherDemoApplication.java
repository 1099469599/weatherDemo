package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching//增加注解@EnableCaching，开启缓存功能 与redis配合
public class WeatherDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDemoApplication.class, args);
	}
}
