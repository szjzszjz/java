package com.szjz.StatePattern;

import com.szjz.StatePattern.state.State;

/**
 * 运动员， 根据状态不同，发挥也不同
 * @author 石中君子
 *
 */
public class Sportsman {
	
	public State state;
	
	public Sportsman() {
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String getState() {
		return state.getClass().getSimpleName();
	}

}
