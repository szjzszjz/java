package com.szjz.builderPattern.item.drink;

import com.szjz.builderPattern.item.Item;
import com.szjz.builderPattern.pack.Bottle;
import com.szjz.builderPattern.pack.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		// 可乐用瓶子装
		return new Bottle();
	}

//	@Override
//	public abstract float price();
	
}
