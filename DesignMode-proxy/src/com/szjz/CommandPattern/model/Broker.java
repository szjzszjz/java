package com.szjz.CommandPattern.model;

import java.util.ArrayList;
import java.util.List;

import com.szjz.CommandPattern.interfaces.Order;

/**
 * 买卖股票的经纪人
 * 
 * @author 石中君子
 *
 */
public class Broker {

	private List<Order> orders = new ArrayList<Order>();

	//拿到委托人给的股票订单
	public void takeOrder(Order order) {
		orders.add(order);
	}

	//对股票订单进行处理
	public void placeOrders() {
		for (Order order : orders) {
			//利用多态的特性决定哪个对象执行哪个命令
			order.execute();
		}
		//处理完之后清除所有的订单
		orders.clear();
	}
}
