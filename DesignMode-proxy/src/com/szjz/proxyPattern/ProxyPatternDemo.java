package com.szjz.proxyPattern;

import java.util.Vector;

/**
 * 1����������ģʽ������������ģʽ��Ҫ�ı������Ƕ���Ľӿڣ�������ģʽ���ܸı���������Ľӿڡ�
 * 2����װ����ģʽ������װ����ģʽΪ����ǿ���ܣ�������ģʽ��Ϊ�˼��Կ��ơ�
 * @author ʯ�о���
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		
		ShoolGirl girl = new ShoolGirl("李玉�?");
		Proxy proxy = new Proxy(girl);
	
		
		
		new Vector<>();
		
		proxy.givenFlower();
		proxy.givenChocolate();
		proxy.givenCake();
	}
}
