package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * ʮ�����ƹ۲���
 * @author ʯ�о���
 *
 */
public class HexObserver extends Observer{

	public HexObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void updata() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()));

	}

}
