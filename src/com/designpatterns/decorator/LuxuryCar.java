package com.designpatterns.decorator;

public class LuxuryCar extends CarDecorator{
	
	public LuxuryCar(Car car){
		super(car);
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.decorator.CarDecorator#assembleCar()
	 */
	@Override
	public void assembleCar() {
		super.assembleCar();
		System.out.println("adding the features LuxuryCar");
	}
}
