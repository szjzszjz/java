package com.szjz.builderPattern;

import java.util.ArrayList;
import java.util.List;

import com.szjz.builderPattern.item.Item;

/**
 * 套餐类
 * @author admin
 *
 */
public class Meal {

	//盛放商品的套餐
	private List<Item> items = new ArrayList<Item>();
	
	//添加商品
	public void addItems(Item item) {
		items.add(item);
	}
	
	//获取套餐的总价格
	public float getCost(){
		float f = 0f;
		for (Item item : items) {
			f += item.price();
		}
		return f;
	}
	
	//显示套餐中的商品
	public void showItems() {
		for (Item item : items) {
			System.out.println(item.name());
			System.out.println(item.price());
			System.out.println(item.packing().pack());
		}
	}
}
