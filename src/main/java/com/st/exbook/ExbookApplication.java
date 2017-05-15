package com.st.exbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.st.exbook.mapper")
public class ExbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExbookApplication.class, args);
	}
}
