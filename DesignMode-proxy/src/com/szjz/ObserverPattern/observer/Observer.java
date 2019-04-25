package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * 所有观察者的抽象类
 * @author 石中君子
 *
 */
public abstract class Observer {

	//所有观察者持有被观察者
	protected Subject subject;
	
	//被观察者发生变化时候 更新所有的观察者
	public abstract void updata();
	
}
