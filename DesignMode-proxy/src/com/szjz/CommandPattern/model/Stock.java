package com.szjz.CommandPattern.model;

/**
 * 创建一个股票类
 * @author 石中君子
 *
 */
public class Stock {

	private String name = "武钢";
	private int quantity = 10;
	
	public void buy() {
		 System.out.println("Stock [ Name: "+name+","
		 		+ "Quantity: " + quantity +" ] buy");
	}
	public void sell() {
		System.out.println("Stock [ Name: "+name+","
				+ "Quantity: " + quantity +" ] sell");
	}
	
}
