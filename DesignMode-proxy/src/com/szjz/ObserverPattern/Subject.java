package com.szjz.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import com.szjz.ObserverPattern.observer.Observer;

/**
 * ���۲�Ķ���
 * @author ʯ�о���
 *
 */
public class Subject {

	private int state;
	
	private List<Observer> observerList = new ArrayList<>();//������еĹ۲���
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	public int getState() {
		return state;
	}
	
	public void addObserver(Observer o) {
		observerList.add(o);
	}
	
	private void notifyAllObservers() {
		for (Observer observer : observerList) {
			observer.updata();
		}

	}
	
}
