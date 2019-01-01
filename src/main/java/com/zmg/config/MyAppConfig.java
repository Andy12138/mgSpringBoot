package com.zmg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zmg.controller.HelloController;

/**
 *@Configuration指明当前类是一个配置类：就是代替之前spring的配置文件
 */
@Configuration
public class MyAppConfig {

	//将方法返回值添加到容器中，容器中这个组件的id就是这个方法的方法名
	//@Bean
	public HelloController helloController() {
		System.out.println("添加组件啦！！！");
		return new HelloController();
	}
}
