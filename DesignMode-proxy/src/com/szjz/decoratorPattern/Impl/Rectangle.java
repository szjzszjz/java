package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		 System.out.println("Shape: Rectangle");

	}

}
