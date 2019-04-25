package com.szjz.ChainofResponsibilityPattern.logger;


public class ErrorLogger extends AbstractLogger {

	
	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName() + " :" + " level:" + level +  " message:" + message);
	}

}
