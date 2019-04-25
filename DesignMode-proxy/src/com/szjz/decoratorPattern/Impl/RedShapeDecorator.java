
package com.szjz.decoratorPattern.Impl;

import com.szjz.decoratorPattern.interfaces.Shape;
import com.szjz.decoratorPattern.interfaces.ShapeDecorator;

/**
 * 集成抽象装饰者类的具体实现类
 * 
 * @author 石中君子
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	private Shape shape;

	// 实现子类构造函数必须先实现父类构造函数
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
