package com.plz.pams_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.plz.pams_back.mapper"})
public class PamsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(PamsBackApplication.class, args);
	}

}
