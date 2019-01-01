package com.zmg;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.zmg.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MgSpringbootApplicationTests {

	@Autowired
	private Person person;
	
	@Autowired
	ApplicationContext ioc;

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void testHelloController() {
		boolean b = ioc.containsBean("helloController");
		System.out.println(b);
	}
	
	@Test
	public void contextLoads() throws UnsupportedEncodingException {
		//System.out.println(person);
		//System.out.println(new String(person.toString().getBytes("ISO-8859-1"), "UTF-8"));
		//日志级别 trace<debug<into<warn<error
		//调整日志级别，以后只会输出这个级别及以后级别的日志，默认是info级别
		logger.trace("这是trace日志。。。");
		logger.debug("这是debug日志。。。");
		logger.info("这是info日志。。。");
		logger.warn("这是warn日志。。。");
		logger.error("这是error日志。。。");
	}

}

