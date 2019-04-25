package com.szjz.NullPattern;

public class NullCustomer extends AbstractCustomer{

	
	@Override
	public boolean isNill() {
		return true;
	}	

	@Override
	public String getName() {
		return "无效的名字";
	}

}
