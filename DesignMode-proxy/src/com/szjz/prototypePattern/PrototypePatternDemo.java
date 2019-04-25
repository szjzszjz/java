package com.szjz.prototypePattern;

import com.szjz.prototypePattern.cache.ShapeCache;
import com.szjz.prototypePattern.shape.Shape;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadShape();
		
		Shape shape=  shapeCache.getClone("1");
		shape.draw();
		Shape shape2= shapeCache.getClone("2");
		shape2.draw();
		Shape shape3= shapeCache.getClone("3");
		shape3.draw();
		
	}
}
