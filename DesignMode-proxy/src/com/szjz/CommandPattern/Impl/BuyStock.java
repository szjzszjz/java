package com.szjz.CommandPattern.Impl;

import com.szjz.CommandPattern.interfaces.Order;
import com.szjz.CommandPattern.model.Stock;

/**
 * ���Ʊ
 * @author ʯ�о���
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
