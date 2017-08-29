package com.designpatterns.decorator;

public class CarDecorator implements Car{

	protected Car car;
	
	public CarDecorator(Car car){
		this.car=car;
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.decorator.Car#assembleCar()
	 */
	@Override
	public void assembleCar() {
		this.car.assembleCar();
	}	
}
