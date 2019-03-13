package com.xworkz.spring.core;

public class Hotel {
	
	private Hotel() {
		// TODO Auto-generated constructor stub
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	public void serving(String foodName)
	{
		System.out.println("serving "+ foodName);
	}
	
}
