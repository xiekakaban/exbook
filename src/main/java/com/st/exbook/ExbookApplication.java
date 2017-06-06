package com.st.exbook;

import com.st.exbook.dto.UserBaseVO;
import com.st.exbook.entity.UserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
public class ExbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExbookApplication.class, args);
	}


}
