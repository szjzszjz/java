package com.szjz.bridgePatter02.shape;

import com.szjz.bridgePatter02.color.Color;

/**
 * ��״�ĳ�����  ����color �ӿڶ��󣬲�ʵ�ֻ����Ĺ���
 * @author ʯ�о���
 *
 */
public abstract class Shape {

	Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
