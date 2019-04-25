package com.szjz.FlyweightPattern;

/**
 * 享元模式：共享原型数据模式 
 * 享元模式（FlyWeight），运用共享技术有效的支持大量细粒度的对象。
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * @author 石中君子
 *
 */
public class FlyweightPatternDemo {
	
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweight = factory.getFlyweight("a");
//		Flyweight flyweight01 = factory.getFlyweight("a");
		flyweight.operation(new UnsharedConcreteFlyweight("第一次调用a"));
		flyweight.operation(new UnsharedConcreteFlyweight("第er次调用a"));
		flyweight.operation(new UnsharedConcreteFlyweight("第san次调用a"));
	}

}
