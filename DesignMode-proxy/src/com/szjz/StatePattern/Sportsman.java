package com.szjz.StatePattern;

import com.szjz.StatePattern.state.State;

/**
 * �˶�Ա�� ����״̬��ͬ������Ҳ��ͬ
 * @author ʯ�о���
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
