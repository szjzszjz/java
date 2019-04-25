package com.szjz.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import com.szjz.ObserverPattern.observer.Observer;

/**
 * 被观察的对象
 * @author 石中君子
 *
 */
public class Subject {

	private int state;
	
	private List<Observer> observerList = new ArrayList<>();//存放所有的观察者
	
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
