
package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;
import com.szjz.decoratorPattern.interfaces.ShapeDecorator;

/**
 * ���ɳ���װ������ľ���ʵ����
 * 
 * @author ʯ�о���
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	private Shape shape;

	// ʵ�����๹�캯��������ʵ�ָ��๹�캯��
	public RedShapeDecorator(Shape shape) {
		super(shape);
		this.shape = shape;

	}

	@Override
	public void draw() {
		setRedBorder(shape);
	}

	private void setRedBorder(Shape shape) {
		System.out.println(shape.getClass().getSimpleName() + " Border Color: Red");
	}

}
