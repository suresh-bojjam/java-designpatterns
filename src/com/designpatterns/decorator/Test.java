package com.designpatterns.decorator;

public class Test {
	public static void main(String args[]){
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assembleCar();
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assembleCar();
	}
}