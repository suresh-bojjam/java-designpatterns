package com.designpatterns.abstractfactory;

public class VehicleFactory {

	public static Vehicle getVehicle(VehicleAbstractFactory factory){
		return factory.createVehicle();
	}
}
