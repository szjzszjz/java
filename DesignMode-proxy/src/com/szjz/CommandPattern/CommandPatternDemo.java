package com.szjz.CommandPattern;

import com.szjz.CommandPattern.Impl.BuyStock;
import com.szjz.CommandPattern.Impl.SellStock;
import com.szjz.CommandPattern.model.Broker;
import com.szjz.CommandPattern.model.Stock;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令
 * @author 石中君子
 *
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
//		股票
		Stock stock = new Stock();
//		买卖命令
		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);
		
//		经纪人
		Broker broker = new Broker();
//		执行命令
		broker.takeOrder(sellStock);
		broker.takeOrder(buyStock);
//		处理完之后命令作废
		broker.placeOrders();
	}
}
