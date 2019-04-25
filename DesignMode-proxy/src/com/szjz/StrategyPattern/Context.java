package com.szjz.StrategyPattern;

import com.szjz.StrategyPattern.interfaces.Strategy;

/**
 * 
 * @author ʯ�о���
 *
 */
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Integer getResult(int a , int b) {
		return strategy.operation(a, b);
	}
	
}
