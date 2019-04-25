package com.szjz.StrategyPattern.Impl;

import com.szjz.StrategyPattern.interfaces.Strategy;

public class OperationMultiply implements Strategy {
	
	

	@Override
	public Integer operation(int a, int b) {
		return a*b;
	}

}
