package com.designpatterns.abstractfactory;

public abstract class Vehicle {
	public abstract String getCost();
	public abstract String getColor();
	public abstract String getWeight();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [getCost()=" + getCost() + ", getColor()=" + getColor() + ", getWeight()=" + getWeight()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
}