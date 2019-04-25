package com.szjz.CommandPattern.Impl;

import com.szjz.CommandPattern.interfaces.Order;
import com.szjz.CommandPattern.model.Stock;

/**
 * 卖股票
 * @author 石中君子
 *
 */
public class SellStock  implements Order{

	Stock stock;
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.sell();
	}

}
