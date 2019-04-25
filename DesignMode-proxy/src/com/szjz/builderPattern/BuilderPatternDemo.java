package com.szjz.builderPattern;

import com.szjz.builderPattern.item.burger.ChickenBurger;
import com.szjz.builderPattern.item.drink.Coke;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		ChickenBurger chickenBurger = new ChickenBurger();
		Coke coke = new Coke();

		Meal meal = new Meal();
		meal.addItems(chickenBurger);
		meal.addItems(coke);
		
		System.out.println("总价："+meal.getCost());
		meal.showItems();

	}

}
