package com.szjz.builderPattern.item;

import com.szjz.builderPattern.pack.Packing;

/**
 * 食物接口
 * @author admin
 *
 */
public interface Item {
	
	public String name();
	public Packing packing();
	public float price();

}
