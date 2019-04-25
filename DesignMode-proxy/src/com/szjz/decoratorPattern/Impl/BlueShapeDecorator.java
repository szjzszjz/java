package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;

/**
 * 藍色形状装饰者  直接实现形状接口
 * @author 石中君子
 *
 */
public class BlueShapeDecorator implements Shape {

	Shape shape;
	public BlueShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		System.out.println(shape.getClass().getSimpleName() + " border color : blue");

	}

}
