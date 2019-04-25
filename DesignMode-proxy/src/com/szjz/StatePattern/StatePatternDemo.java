package com.szjz.StatePattern;

import com.szjz.StatePattern.state.StateBad;
import com.szjz.StatePattern.state.StateGood;

/**
 * ��״̬ģʽ��State Pattern���У������Ϊ�ǻ�������״̬�ı�ġ��������͵����ģʽ������Ϊ��ģʽ��
 * ��״̬ģʽ�У����Ǵ�����ʾ����״̬�Ķ����һ����Ϊ����״̬����ı���ı�� context ����
 * @author ʯ�о���
 *
 *Ӧ��ʵ���� 1���������ʱ���˶�Ա����������״̬��������״̬�ͳ���״̬
 */
public class StatePatternDemo {
	public static void main(String[] args) {
		
		Sportsman sportsman = new Sportsman();
		
		new StateGood().state(sportsman);
		
		new StateBad().state(sportsman);
		
		System.out.println(sportsman.getState());
		
	}

}
