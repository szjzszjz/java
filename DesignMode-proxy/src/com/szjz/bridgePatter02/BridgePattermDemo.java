package com.szjz.bridgePatter02;

import com.szjz.bridgePatter02.color.Black;
import com.szjz.bridgePatter02.color.Red;
import com.szjz.bridgePatter02.color.White;
import com.szjz.bridgePatter02.shape.Circle;
import com.szjz.bridgePatter02.shape.Rectangle;
import com.szjz.bridgePatter02.shape.Square;


/**
 *�Ž�ģʽ�ĺ������ һ����������������仯��ά�ȣ���������ά�ȶ���Ҫ������չ��
 * @author ʯ�о���
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
