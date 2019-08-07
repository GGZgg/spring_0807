package com.atguigu.spring.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.bean.HelloWorld;
import com.atguigu.spring.bean.Person;

public class TestHello {
	@Test
	public void test1() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h = (HelloWorld) context.getBean("hello");
		h.say();
	}
	
	@Test
	public void test2() throws Exception {
		//获取容器对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p1 = (Person) context.getBean("p1");
		Person p2 = (Person) context.getBean("p2");
		System.out.println(p1);
		System.out.println(p1.getPhone());
		System.out.println(p2);
		System.out.println(p2.getPhone());
	}
}
