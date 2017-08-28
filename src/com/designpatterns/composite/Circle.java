package com.designpatterns.composite;

public class Circle implements Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.designpatterns.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String color) {
		System.out.println("Filling the color "+color+" in shape "+this.getClass().getName());
	}

}
