package com.szjz.abstractFactory.Factory;



import com.szjz.abstractFactory.color.Color;
import com.szjz.abstractFactory.shape.Circle;
import com.szjz.abstractFactory.shape.Rectangle;
import com.szjz.abstractFactory.shape.Shape;
import com.szjz.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

}
