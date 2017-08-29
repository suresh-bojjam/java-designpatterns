package com.designpatterns.bridge;

public class Produce implements Workshop{
	
	
	/* (non-Javadoc)
	 * @see com.designpatterns.bridge.Workshop#manufactuer()
	 */
	@Override
	public void work() {
		System.out.print(" Produced");
	}
}
