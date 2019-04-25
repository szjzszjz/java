package com.szjz.MementoPattern;

/**
 * 相当于操作者。操作获取对象的状态
 * @author 石中君子
 *
 */
public class Originator {

	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

}
