package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * 二进制观察者
 * 
 * @author 石中君子
 *
 */
public class BinObserver extends Observer {

	public BinObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void updata() {
		System.out.println("Bin String: " + Integer.toBinaryString(subject.getState()));

	}

}
