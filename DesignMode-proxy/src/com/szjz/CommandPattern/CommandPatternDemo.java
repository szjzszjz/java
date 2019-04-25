package com.szjz.CommandPattern;

import com.szjz.CommandPattern.Impl.BuyStock;
import com.szjz.CommandPattern.Impl.SellStock;
import com.szjz.CommandPattern.model.Broker;
import com.szjz.CommandPattern.model.Stock;

/**
 * ����ģʽ��Command Pattern����һ���������������ģʽ����������Ϊ��ģʽ��
 * �������������ʽ�����ڶ����У����������ö���
 * ���ö���Ѱ�ҿ��Դ��������ĺ��ʵĶ��󣬲��Ѹ��������Ӧ�Ķ��󣬸ö���ִ������
 * @author ʯ�о���
 *
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
//		��Ʊ
		Stock stock = new Stock();
//		��������
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
//		������
		Broker broker = new Broker();
//		ִ������
		broker.takeOrder(sellStock);
		broker.takeOrder(buyStock);
//		������֮����������
		broker.placeOrders();
	}
}
