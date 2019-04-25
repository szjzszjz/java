package com.szjz.prototypePattern.cache;

import java.util.Hashtable;

import com.szjz.prototypePattern.shape.Circle;
import com.szjz.prototypePattern.shape.Rectangle;
import com.szjz.prototypePattern.shape.Shape;
import com.szjz.prototypePattern.shape.Square;

public class ShapeCache {

	//用于存放图形 相当于缓存区
	private Hashtable<String, Object> shapeMap = new Hashtable<String, Object>();

	//将图形放入缓存区
	public void loadShape() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
	
	
	public Shape getClone(String id) {
		Shape shape = (Shape) shapeMap.get(id);
		return (Shape) shape.clone();
	}
}
