package com.szjz.bridgePatter02.shape;

import com.szjz.bridgePatter02.color.Color;

/**
 * 形状的抽象类  持有color 接口对象，并实现画画的功能
 * @author 石中君子
 *
 */
public abstract class Shape {

	Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
