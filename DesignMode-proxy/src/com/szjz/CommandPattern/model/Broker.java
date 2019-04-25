package com.szjz.CommandPattern.model;

import java.util.ArrayList;
import java.util.List;

import com.szjz.CommandPattern.interfaces.Order;

/**
 * ������Ʊ�ľ�����
 * 
 * @author ʯ�о���
 *
 */
public class Broker {

	private List<Order> orders = new ArrayList<Order>();

	//�õ�ί���˸��Ĺ�Ʊ����
	public void takeOrder(Order order) {
		orders.add(order);
	}

	//�Թ�Ʊ�������д���
	public void placeOrders() {
		for (Order order : orders) {
			//���ö�̬�����Ծ����ĸ�����ִ���ĸ�����
			order.execute();
		}
		//������֮��������еĶ���
		orders.clear();
	}
}
