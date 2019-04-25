package com.szjz.abstractFactory.Factory;

import com.szjz.abstractFactory.color.Color;
import com.szjz.abstractFactory.shape.Shape;

/**
 * 抽象工厂类  所有工厂的顶级父类
 * @author admin
 *
 */
public abstract class AbstractFactory {

	public  abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
	
}
