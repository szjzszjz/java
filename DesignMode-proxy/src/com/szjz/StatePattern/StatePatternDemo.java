package com.szjz.StatePattern;

import com.szjz.StatePattern.state.StateBad;
import com.szjz.StatePattern.state.StateGood;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 * @author 石中君子
 *
 *应用实例： 1、打篮球的时候运动员可以有正常状态、不正常状态和超常状态
 */
public class StatePatternDemo {
	public static void main(String[] args) {
		
		Sportsman sportsman = new Sportsman();
		
		new StateGood().state(sportsman);
		
		new StateBad().state(sportsman);
		
		System.out.println(sportsman.getState());
		
	}

}
