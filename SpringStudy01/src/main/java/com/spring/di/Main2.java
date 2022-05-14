package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/di/DiBeans.xml");
		CentralController2 centralController2 = (CentralController2)context.getBean("centralController");
		centralController2.onAll();
		centralController2.offAll();
	}

}
