package com.designpatterns.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape{

	public boolean fill;
	
	public Oval(boolean fill){
		this.fill=fill;
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.flyweight.Shape#draw(java.awt.Graphics, int, int, int, int, java.awt.Color)
	 */
	@Override
	public void draw(Graphics g, int x, int y, int height, int width, Color c) {
		// TODO Auto-generated method stub
		
	}

	
}