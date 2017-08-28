package com.designpatterns.composite;

public class CompositeTest {
	public static void main(String args[]){
		
		Circle circle1=new Circle();
		Triangle triangle1=new Triangle();
		
		Circle circle2=new Circle();
		Triangle triangle2=new Triangle();
		
		Circle circle3=new Circle();
		Triangle triangle3=new Triangle();
		
		Drawing draw=new Drawing();
		
		draw.add(circle1);
		draw.add(triangle1);
		
		draw.add(circle2);
		draw.add(triangle2);
		
		draw.add(circle3);
		draw.add(triangle3);		
		
		draw.draw("Green");
	}
}
