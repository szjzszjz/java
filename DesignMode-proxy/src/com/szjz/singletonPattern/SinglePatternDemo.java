package com.szjz.singletonPattern;

public class SinglePatternDemo {

	public static void main(String[] args) {
		
		SingleObject instance = SingleObject.getInstance();
		instance.showMassage();
	}
}
