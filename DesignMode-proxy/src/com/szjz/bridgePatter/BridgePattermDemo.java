package com.szjz.bridgePatter;

import com.szjz.bridgePatter.Impl.Circle;
import com.szjz.bridgePatter.Impl.GreenCircle;
import com.szjz.bridgePatter.Impl.RedCircle;

/**
 * 
 *�Ž�ģʽ�ĺ������ һ����������������仯��ά�ȣ���������ά�ȶ���Ҫ������չ��

 * ʹ�� Shape �� DrawAPI �໭����ͬ��ɫ��Բ��
 * @author ʯ�о���
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
