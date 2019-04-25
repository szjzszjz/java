package com.szjz.prototypePattern.shape;

public class Circle extends Shape{

	//设置类型
	public Circle() {
		type = "Circle";
	}
	
	public void draw() {
		System.out.println("draw circle");
	}
}
