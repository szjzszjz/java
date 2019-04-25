package com.szjz.builderPattern.item.burger;

import com.szjz.builderPattern.item.Item;
import com.szjz.builderPattern.pack.Packing;
import com.szjz.builderPattern.pack.Wrapper;

//抽象类实现接口类 可以不实现其方法
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// 汉堡包用纸质包装
		return new Wrapper();
	}

//	@Override
//	public abstract float price();
}
