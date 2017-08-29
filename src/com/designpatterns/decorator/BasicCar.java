package com.designpatterns.decorator;

public class BasicCar implements Car{

	
	
	/* (non-Javadoc)
	 * @see com.designpatterns.decorator.Car#assembleCar()
	 */
	@Override
	public void assembleCar() {
		System.out.println("Basic car");
	}
}
