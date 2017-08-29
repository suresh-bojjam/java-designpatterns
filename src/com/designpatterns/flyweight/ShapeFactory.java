package com.designpatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	HashMap<ShapeType, Shape> shapeFactory=new HashMap<ShapeType,Shape>();

	public static enum ShapeType{
		LINE,OVAL_FILL,OVAL_NOT_FILL
	}

	public Shape getShape(ShapeType shapeType){
		Shape shape=shapeFactory.get(shapeType);
		if(shape==null){
			if(shape==null&&shapeType.equals(ShapeType.LINE)){
				shape=new Line();
				shapeFactory.put(ShapeType.LINE, shape);
			}else if(shape==null&&shapeType.equals(ShapeType.OVAL_FILL)){
				shape=new Oval(true);
				shapeFactory.put(ShapeType.OVAL_FILL, shape);
			}else if(shape==null&&shapeType.equals(ShapeType.OVAL_NOT_FILL)){
				shape=new Oval(false);
				shapeFactory.put(ShapeType.OVAL_NOT_FILL, shape);				
			}
		}
		return shape;
	}
}