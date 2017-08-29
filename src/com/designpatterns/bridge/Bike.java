package com.designpatterns.bridge;

public class Bike extends Vehicle{


	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.bridge.Vehicle#manufactuer()
	 */
	@Override
	public void manufactuer() {
		System.out.println("Bike ");
		workshop1.work();
		workshop2.work();
	}
}