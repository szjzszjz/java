package com.szjz.prototypePattern.shape;

public class Rectangle extends Shape{

	//设置类型
	public Rectangle() {
		type = "Rectangle";
	}
	
	public void draw() {
		System.out.println("draw Rectangle");
	}
}
