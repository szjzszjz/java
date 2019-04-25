package com.szjz.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *  对象负责从 Memento 中恢复对象的状态。
 * @author 石中君子
 *
 */
public class CareTaker {
	
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	
	public void add(Memento m) {
		mementoList.add(m);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}

}
