package com.szjz.abstractFactory.Factory;


/**
 * 生产工程的类 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @author admin
 *
 */
public class FactoryProducer {
	
	//根据颜色和形状判断生成那种工厂
	public static AbstractFactory getAbstractFactory(String choice) {
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}

}
