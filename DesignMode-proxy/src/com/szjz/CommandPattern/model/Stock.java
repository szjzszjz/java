package com.szjz.CommandPattern.model;

/**
 * ����һ����Ʊ��
 * @author ʯ�о���
 *
 */
public class Stock {

	private String name = "���";
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
