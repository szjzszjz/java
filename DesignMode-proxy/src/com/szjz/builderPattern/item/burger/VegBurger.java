package com.szjz.builderPattern.item.burger;


//实现抽象类未实现的全部方法
public class VegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "VegBurger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 15f;
	}

	

}
