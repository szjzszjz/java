package com.szjz.decoratorPattern.interfaces;

/**
 * 抽象装饰者类
 * @author 石中君子
 *
 */
public abstract class ShapeDecorator implements Shape {

	Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		shape.draw();

	}

}
