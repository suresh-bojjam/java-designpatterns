package com.designpatterns.composite;

public class Triangle implements Shape{

	/* (non-Javadoc)
	 * @see com.designpatterns.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String color) {
		System.out.println("Filling the color "+color+" in shape "+this.getClass().getName());		
	}

	public static void main(String args[]){
		
	}
}
