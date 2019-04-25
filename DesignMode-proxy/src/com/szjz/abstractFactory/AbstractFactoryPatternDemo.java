package com.szjz.abstractFactory;

import com.szjz.abstractFactory.Factory.ColorFactory;
import com.szjz.abstractFactory.Factory.FactoryProducer;
import com.szjz.abstractFactory.Factory.ShapeFactory;
import com.szjz.abstractFactory.color.Red;
import com.szjz.abstractFactory.shape.Circle;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//现获取需要什么样的工�?
		ShapeFactory shapeF = (ShapeFactory) FactoryProducer.getAbstractFactory("shape");
		ColorFactory colorF = (ColorFactory) FactoryProducer.getAbstractFactory("color");
		
		//根据工厂生产对应的类
		Circle circle = (Circle) shapeF.getShape("circle");
		Red red = (Red) colorF.getColor("red");
		circle.draw();
		red.fill();
		
		
	}
}
