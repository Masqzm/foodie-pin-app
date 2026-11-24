package com.masq.foodiepin;

import org.springframework.boot.SpringApplication;

public class TestFoodiepinApplication {

	public static void main(String[] args) {
		SpringApplication.from(FoodiepinApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
