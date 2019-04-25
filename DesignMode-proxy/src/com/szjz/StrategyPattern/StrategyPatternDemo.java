package com.szjz.StrategyPattern;

import com.szjz.StrategyPattern.Impl.OperationAdd;
import com.szjz.StrategyPattern.Impl.OperationDivision;
import com.szjz.StrategyPattern.Impl.OperationMultiply;

/**
 * �ڲ���ģʽ��Strategy Pattern���У�һ�������Ϊ�����㷨����������ʱ���ġ� �������͵����ģʽ������Ϊ��ģʽ��
 * �ڲ���ģʽ�У����Ǵ�����ʾ���ֲ��ԵĶ����һ����Ϊ���Ų��Զ���ı���ı�� context ���� ���Զ���ı� context �����ִ���㷨��
 * 
 * @author ʯ�о���
 * 
 * ʹ�ó�����
 *  1�������һ��ϵͳ����������࣬����֮���������������ǵ���Ϊ����ôʹ�ò���ģʽ���Զ�̬����һ�������������Ϊ��ѡ��һ����Ϊ��
 *  2��һ��ϵͳ��Ҫ��̬���ڼ����㷨��ѡ��һ�֡� 
 *  3�����һ�������кܶ����Ϊ���������ǡ����ģʽ����Щ��Ϊ��ֻ��ʹ�ö��ص�����ѡ�������ʵ�֡� 
 * 
 * ʹ�ò���ģʽ  ��ʹ��������չ�㷨�ǳ����ף�ֻ��Ҫ���һ���༴�� �����޸���������
 *
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Integer add = new Context(new OperationAdd()).getResult(2, 3);
		Integer multify = new Context(new OperationMultiply()).getResult(4, 5);
		Integer division = new Context(new OperationDivision()).getResult(20, 5);

		System.out.println(add);
		System.out.println(multify);
		System.out.println(division);
		
	}

}
