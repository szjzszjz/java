package com.szjz.MementoPattern;


/**
 * 备忘录  包含了要被恢复的对象的状态
 * @author 石中君子
 *
 */
public class Memento {

	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}

