package com.szjz.decoratorPattern.interfaces;

/**
 * ����װ������
 * @author ʯ�о���
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
