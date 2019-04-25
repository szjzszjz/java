package com.szjz.bridgePatter.Impl;

import com.szjz.bridgePatter.interfaces.DrawAPI;
import com.szjz.bridgePatter.interfaces.Shape;

/**
 * 创建实现了 Shape 接口的实体类。
 * @author 石中君子
 *
 */
public class Circle extends Shape {

	private int x,y,radius;
	
	public Circle(int x, int y , int radius, DrawAPI drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);

	}

}
