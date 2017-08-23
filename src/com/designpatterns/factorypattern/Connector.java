package com.designpatterns.factorypattern;

public abstract class Connector {
	
	public String type;
	public abstract String getURL();
	public abstract Object getConnection();
	
	
	public String getType() {
		return type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DriverManager [getURL()=" + getURL() + ", getConnection()=" + getConnection() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
