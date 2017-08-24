package com.designpatterns.abstractfactory;

public class TestPattern {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	private static void testAbstractFactory() {
		Vehicle car = VehicleFactory.getVehicle(new CarFactory("450000","BLUE","1024KG"));
		Vehicle truck = VehicleFactory.getVehicle(new TruckFactory("4000000","BLUE","10240KG"));
		System.out.println("AbstractFactory Car Config::"+car);
		System.out.println("AbstractFactory Truck Config::"+truck);
	}
}