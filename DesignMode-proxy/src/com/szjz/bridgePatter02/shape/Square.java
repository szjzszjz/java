package com.szjz.bridgePatter02.shape;

import com.szjz.bridgePatter02.color.Color;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
		
	}

	@Override
	public void draw() {
		System.out.println("draw square with " + color.paint() + " color");

	}

}
