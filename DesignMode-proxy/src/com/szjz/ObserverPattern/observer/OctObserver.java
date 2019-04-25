package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * 十进制观察者
 * @author 石中君子
 *
 */
public class OctObserver extends Observer{


	public OctObserver(Subject subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void updata() {
		System.out.println("Oct String: " + Integer.toOctalString(subject.getState()));

	}
}
