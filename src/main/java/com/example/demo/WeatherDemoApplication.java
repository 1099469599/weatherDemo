package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableCaching//增加注解@EnableCaching，开启缓存功能 与redis配合
@EnableDiscoveryClient //设置为客户端
@EnableFeignClients//feign 服务消费者 配置
public class WeatherDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDemoApplication.class, args);
	}
}
