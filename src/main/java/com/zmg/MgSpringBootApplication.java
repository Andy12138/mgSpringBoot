package com.zmg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@ImportResource(locations = {"classpath:beans.xml"})//导入spring配置文件让其生效
@SpringBootApplication
public class MgSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgSpringbootApplication.class, args);
	}

}

