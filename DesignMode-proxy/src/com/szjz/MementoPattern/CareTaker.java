package com.szjz.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *  ������� Memento �лָ������״̬��
 * @author ʯ�о���
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
