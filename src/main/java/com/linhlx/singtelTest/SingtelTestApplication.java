package com.linhlx.singtelTest;

import com.linhlx.singtelTest.model.Animal;
import com.linhlx.singtelTest.model.Bird;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingtelTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingtelTestApplication.class, args);
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
