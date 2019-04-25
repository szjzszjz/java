package com.szjz.proxyPattern;

import java.util.Vector;

/**
 * 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 * 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 * @author 石中君子
 *
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		
		ShoolGirl girl = new ShoolGirl("鏉庣帀鐜?");
		Proxy proxy = new Proxy(girl);
	
		
		
		new Vector<>();
		
		proxy.givenFlower();
		proxy.givenChocolate();
		proxy.givenCake();
	}
}
