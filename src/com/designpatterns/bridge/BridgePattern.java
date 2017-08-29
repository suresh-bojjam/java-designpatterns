package com.designpatterns.bridge;

public class BridgePattern {
	public static void main(String args[]){
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufactuer();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufactuer();
	}
}
//http://javapapers.com/design-patterns/bridge-design-pattern/