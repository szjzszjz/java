package com.szjz.bridgePatter02;

import com.szjz.bridgePatter02.color.Black;
import com.szjz.bridgePatter02.color.Red;
import com.szjz.bridgePatter02.color.White;
import com.szjz.bridgePatter02.shape.Circle;
import com.szjz.bridgePatter02.shape.Rectangle;
import com.szjz.bridgePatter02.shape.Square;


/**
 *桥接模式的核心理念： 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 * @author 石中君子
 *
 */
public class BridgePattermDemo {
	public static void main(String[] args) {
		White white = new White();
		Red red = new Red();
		Black black = new Black();
		
		new Square(black).draw();
		new Square(red).draw();
		new Rectangle(red).draw();
		new Circle(white).draw();
	}

}
