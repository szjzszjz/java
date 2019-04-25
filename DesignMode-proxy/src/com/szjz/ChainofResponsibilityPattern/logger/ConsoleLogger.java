package com.szjz.ChainofResponsibilityPattern.logger;


public class ConsoleLogger extends AbstractLogger {

	
	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName() + " :" + " level:" + level +  " message:" + message);
	}

}
