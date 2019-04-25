package com.szjz.FlyweightPattern;

import java.util.HashMap;

/**
 * 享元工厂
 * 
 * @author 石中君子
 *
 */
public class FlyweightFactory {

	private HashMap<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = flyweightMap.get(key);
		
		if (flyweight != null) {
			System.out.println("具体享元"+key+"已经存在，被成功获取！");
		}else {
			flyweight= new ConcreteFlyweight(key);
			flyweightMap.put(key, flyweight);
		}
		return flyweight;
	}

}
