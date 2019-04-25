package com.szjz.ObserverPattern;

import com.szjz.ObserverPattern.observer.BinObserver;
import com.szjz.ObserverPattern.observer.HexObserver;
import com.szjz.ObserverPattern.observer.OctObserver;

/**
 * ����������һ�Զ��ϵʱ����ʹ�ù۲���ģʽ��Observer Pattern����
 * ���磬��һ�������޸�ʱ������Զ�֪ͨ�����������󡣹۲���ģʽ������Ϊ��ģʽ��
 * @author ʯ�о���
 *
 *ԭ���۲��߳��б��۲��߶����򱻹۲�������仯���۲��߿��Ի�ȡ���۲��ߵ����ԣ��Ӷ���Ӧ�ı�
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
