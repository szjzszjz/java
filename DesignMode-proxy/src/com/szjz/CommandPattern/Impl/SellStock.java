package com.szjz.CommandPattern.Impl;

import com.szjz.CommandPattern.interfaces.Order;
import com.szjz.CommandPattern.model.Stock;

/**
 * ����Ʊ
 * @author ʯ�о���
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
