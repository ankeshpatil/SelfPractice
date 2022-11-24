package com.javapractice.factorydesign;

public class ShapeDesign {
	
	public Shape getshape(String shape) {
		if(shape==null) {
			return null;
		}
		else if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else 
			return null;
		
	}

}
