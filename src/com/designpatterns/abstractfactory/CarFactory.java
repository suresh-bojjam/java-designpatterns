package com.designpatterns.abstractfactory;

public class CarFactory implements VehicleAbstractFactory {

	private String cost;
	private String color;
	private String weight;
	
	public CarFactory(String cost,String color,String weight){
		this.cost=cost;
		this.color=color;
		this.weight=weight;
	}
	
	@Override
	public Vehicle createVehicle() {
		return new Car(cost,color,weight);
	}
}
