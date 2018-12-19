package com.zmg.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zmg.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MgSpringBootApplicationTests {
	
	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		System.out.println("开始吧");
		System.out.println(person);
		System.out.println("结束吧");
	}

}

