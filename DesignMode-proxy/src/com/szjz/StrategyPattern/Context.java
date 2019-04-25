package com.szjz.StrategyPattern;

import com.szjz.StrategyPattern.interfaces.Strategy;

/**
 * 
 * @author Ê¯ÖÐ¾ý×Ó
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
