package com.szjz.abstractFactory.Factory;

import com.szjz.abstractFactory.color.Blue;
import com.szjz.abstractFactory.color.Color;
import com.szjz.abstractFactory.color.Green;
import com.szjz.abstractFactory.color.Red;
import com.szjz.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("red")) {
			return new Red();
		}else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
