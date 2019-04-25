package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;

/**
 * �{ɫ��״װ����  ֱ��ʵ����״�ӿ�
 * @author ʯ�о���
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
