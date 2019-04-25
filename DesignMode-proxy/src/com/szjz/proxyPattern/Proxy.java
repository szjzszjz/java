package com.szjz.proxyPattern;

public class Proxy implements Given{
	
	private Pursuer pursuer;
	
	public Proxy(ShoolGirl girl) {
		pursuer = new Pursuer(girl);
	}
	
	public void givenFlower() {
		pursuer.givenFlower();
	}

	public void givenChocolate() {
		pursuer.givenChocolate();
	}

	@Override
	public void givenCake() {
		// TODO Auto-generated method stub
		
	}
	

}
