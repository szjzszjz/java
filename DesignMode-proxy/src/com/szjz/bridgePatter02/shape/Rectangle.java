package com.szjz.bridgePatter02.shape;

import com.szjz.bridgePatter02.color.Color;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
		
	}

	@Override
	public void draw() {
		System.out.println("draw rectangle with " + color.paint() + " color");

	}

}
