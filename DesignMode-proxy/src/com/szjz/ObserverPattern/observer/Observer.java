package com.szjz.ObserverPattern.observer;

import com.szjz.ObserverPattern.Subject;

/**
 * ���й۲��ߵĳ�����
 * @author ʯ�о���
 *
 */
public abstract class Observer {

	//���й۲��߳��б��۲���
	protected Subject subject;
	
	//���۲��߷����仯ʱ�� �������еĹ۲���
	public abstract void updata();
	
}
