package com.designpatterns.abstractfactory;

public class TruckFactory implements VehicleAbstractFactory {

	private String cost;
	private String color;
	private String weight;
	
	public TruckFactory(String cost,String color,String weight){
		this.cost=cost;
		this.color=color;
		this.weight=weight;
	}
	
	@Override
	public Vehicle createVehicle() {
		return new Truck(cost,color,weight);
	}
}
