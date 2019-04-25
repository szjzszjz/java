package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		 System.out.println("Shape: Circle");

	}

}
