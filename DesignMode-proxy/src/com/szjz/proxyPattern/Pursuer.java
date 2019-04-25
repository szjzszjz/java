package com.szjz.proxyPattern;

public class Pursuer implements Given{
	
	private ShoolGirl girl; 
	
	public Pursuer(ShoolGirl girl) {
		this.girl = girl;
	}
	
	public void givenFlower() {
		System.out.println(girl.getName() + "送你的花");
	}

	public void givenChocolate() {
		System.out.println(girl.getName() + "送你的巧克力");
	}

	@Override
	public void givenCake() {
		// TODO Auto-generated method stub
		
	}
}
