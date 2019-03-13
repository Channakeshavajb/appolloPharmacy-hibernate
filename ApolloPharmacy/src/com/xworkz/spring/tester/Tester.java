package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.core.Hotel;
import com.xworkz.spring.core.Pharmacy;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//String xmlFiles = "resource/context.xml";
	ApplicationContext spring = new ClassPathXmlApplicationContext("resource/context.xml");
	Pharmacy parma = spring.getBean(Pharmacy.class);
	parma.sellingMediceene("dolo350");
	
	
	
	Thread t=spring.getBean(Thread.class);
	Exception e= spring.getBean(Exception.class);
	
	String stringFromspring =spring.getBean("lowerCase",String.class);
	String stringFrom =spring.getBean("upperCase",String.class);
	Hotel h =spring.getBean("hotel",Hotel.class);
	spring.getBean("udupi",Hotel.class);
	
	int count = spring.getBeanDefinitionCount();
	System.out.println("count of objects is\t"+count);
	
	}

}
