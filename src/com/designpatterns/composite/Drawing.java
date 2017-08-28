package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

	List<Shape> list=new ArrayList<Shape>();

	public static void main(String args[]){
		
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String color) {
		for(Shape shape:list){
			shape.draw(color);
		}
	}
	
	public void add(Shape obj){
		list.add(obj);
	}
	
	public void remove(Shape obj){
		list.remove(obj);
	}
}
