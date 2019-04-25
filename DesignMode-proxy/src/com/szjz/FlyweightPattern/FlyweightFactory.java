package com.szjz.FlyweightPattern;

import java.util.HashMap;

/**
 * ��Ԫ����
 * 
 * @author ʯ�о���
 *
 */
public class FlyweightFactory {

	private HashMap<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = flyweightMap.get(key);
		
		if (flyweight != null) {
			System.out.println("������Ԫ"+key+"�Ѿ����ڣ����ɹ���ȡ��");
		}else {
			flyweight= new ConcreteFlyweight(key);
			flyweightMap.put(key, flyweight);
		}
		return flyweight;
	}

}
