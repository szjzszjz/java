package com.szjz.CommandPattern.Impl;

import com.szjz.CommandPattern.interfaces.Order;
import com.szjz.CommandPattern.model.Stock;

/**
 * 买股票
 * @author 石中君子
 *
 */
public class BuyStock  implements Order{

	Stock stock;
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.buy();
	}

}
