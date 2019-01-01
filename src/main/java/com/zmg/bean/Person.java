package com.zmg.bean;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
/**
 * @Component 是将Person类加入到容器中
 * @ConfigurationProperties 注解是引入配置文件,
 * 			prefix="person"是为了指名引用的是配置文件中的哪个配置对象
 * @ConfigurationProperties和@Value相比：可以一次性全部赋值，支持@validated校验，支持复杂对象如map，但是不支持表达式
 * @value就支持表达式如#{24+1}
 * @Validated校验
 * @PropertySource加载指定的配置文件
 */
@PropertySource(value= {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix= "person")
@Validated
public class Person {

	//@Value("${person.lastNname}")
	//@Email
	private String lastName;
	//@Value("#{24+1}")
	private int age;
	private Map<String, Object> maps;
	private List<Object> list;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", maps=" + maps + ", list=" + list + "]";
	}
	
	
}
