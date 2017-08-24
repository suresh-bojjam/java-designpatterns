package com.designpatterns.abstractfactory;

public class Car extends Vehicle{

	private String cost;
	private String color;
	private String weight;
	
	public Car(String cost,String color,String weight){
		this.cost=cost;
		this.color=color;
		this.weight=weight;
	}
	
	@Override
	public String getCost() {
		return this.cost;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getWeight() {
		return this.weight;
	}

}
