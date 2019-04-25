package com.szjz.bridgePatter;

import com.szjz.bridgePatter.Impl.Circle;
import com.szjz.bridgePatter.Impl.GreenCircle;
import com.szjz.bridgePatter.Impl.RedCircle;

/**
 * 
 *桥接模式的核心理念： 一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。

 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 * @author 石中君子
 *
 */
public class BridgePattermDemo {

	public static void main(String[] args) {
		
		Circle rc = new Circle(100, 100, 10, new RedCircle());
		Circle gc = new Circle(100, 100, 10, new GreenCircle());
		
		rc.draw();
		gc.draw();
	}
}
