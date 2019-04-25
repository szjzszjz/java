package com.szjz.bridgePatter02.shape;

import com.szjz.bridgePatter02.color.Color;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
		
	}

	@Override
	public void draw() {
		System.out.println("draw circle with " + color.paint() + " color");

	}

}
