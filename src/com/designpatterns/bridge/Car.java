package com.designpatterns.bridge;

public class Car extends Vehicle{

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufactuer() {
		System.out.println("Car ");
		workshop1.work();
		workshop1.work();
	}
}
