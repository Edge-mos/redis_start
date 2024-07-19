package com.androedge.spredis;

import org.springframework.boot.SpringApplication;

public class TestSpringRedisStartApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringRedisStartApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
