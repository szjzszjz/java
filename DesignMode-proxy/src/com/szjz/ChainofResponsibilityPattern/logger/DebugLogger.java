package com.szjz.ChainofResponsibilityPattern.logger;


public class DebugLogger extends AbstractLogger {


	public DebugLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		System.out.println(this.getClass().getSimpleName() + " :" + " level:" + level +  " message:" + message);
	}

}
