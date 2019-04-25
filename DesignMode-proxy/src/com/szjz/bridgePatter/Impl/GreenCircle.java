package com.szjz.bridgePatter.Impl;

import com.szjz.bridgePatter.interfaces.DrawAPI;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类
 * @author 石中君子
 *
 */
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");

	}

}
