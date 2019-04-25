package com.szjz.decoratorPattern;

import com.szjz.decoratorPattern.Impl.BlueShapeDecorator;
import com.szjz.decoratorPattern.Impl.Circle;
import com.szjz.decoratorPattern.Impl.Rectangle;
import com.szjz.decoratorPattern.Impl.RedShapeDecorator;
import com.szjz.decoratorPattern.interfaces.Shape;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 * 我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
 * @author 石中君子
 *
 *
 *使用 RedShapeDecorator 来装饰 Shape 对象。
 */
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		/*Circle circle = new Circle();
		
		circle.draw();*/
		
		Shape redShape = new RedShapeDecorator(new Circle());
		redShape.draw();
		
		BlueShapeDecorator blueRectangle = new BlueShapeDecorator(new Rectangle());
		blueRectangle.draw();
	}
}
