package com.szjz.MementoPattern;

/**
 * �൱�ڲ����ߡ�������ȡ�����״̬
 * @author ʯ�о���
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
