package com.szjz.ObserverPattern;

import com.szjz.ObserverPattern.observer.BinObserver;
import com.szjz.ObserverPattern.observer.HexObserver;
import com.szjz.ObserverPattern.observer.OctObserver;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 * @author 石中君子
 *
 *原理：观察者持有被观察者对象，向被观察对象发生变化，观察者可以获取被观察者的属性，从而相应改变
 */
public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		new BinObserver(subject);
		new OctObserver(subject);
		new HexObserver(subject);
		
		subject.setState(14);
		
		
		
	}
}
