package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * 十六进制观察者
 * @author 石中君子
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
