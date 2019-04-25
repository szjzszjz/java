package com.szjz.bridgePatter.Impl;

import com.szjz.bridgePatter.interfaces.DrawAPI;
import com.szjz.bridgePatter.interfaces.Shape;

/**
 * ����ʵ���� Shape �ӿڵ�ʵ���ࡣ
 * @author ʯ�о���
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
