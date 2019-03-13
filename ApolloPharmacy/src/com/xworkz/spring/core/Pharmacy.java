package com.xworkz.spring.core;

public class Pharmacy {
	
	public Pharmacy() {
		// TODO Auto-generated constructor stub
	System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	public void sellingMediceene(String name)
	{
		System.out.println("selling medicene............");
		if(name !=null) {
			System.out.println("medicene sold out");
			return;
		}
		else {
			System.out.println("medicene not found"); 
		}
	}

}
