package com.szjz.prototypePattern.shape;

public class Square extends Shape{

	//设置类型
	public Square() {
		type = "Square";
	}
	
	public void draw() {
		System.out.println("draw Square");
	}
}
