package com.szjz.bridgePatter.Impl;

import com.szjz.bridgePatter.interfaces.DrawAPI;

/**
 * ����ʵ���� DrawAPI �ӿڵ�ʵ���Ž�ʵ����
 * @author ʯ�о���
 *
 */
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");

	}

}
