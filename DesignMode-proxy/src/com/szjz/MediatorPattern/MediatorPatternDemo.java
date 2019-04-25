package com.szjz.MediatorPattern;

/**
 * �н���ģʽ��Mediator Pattern�����������Ͷ���������֮���ͨ�Ÿ����ԡ�
 * ����ģʽ�ṩ��һ���н��࣬����ͨ������ͬ��֮���ͨ�ţ���֧������ϣ�ʹ��������ά���� �н���ģʽ������Ϊ��ģʽ��
 * 
 * @author ʯ�о���
 * Ӧ��ʵ����
 *  1���й����� WTO ֮ǰ�Ǹ��������໥ó�ף��ṹ���ӣ������Ǹ�������ͨ�� WTO ������ó�ס�
 *  2����������ϵͳ��
 *  3��MVC ��ܣ�����C�������������� M��ģ�ͣ��� V����ͼ�����н��ߡ�
 *ģ��qq����  �û�ֻ�ܷ�����Ϣ չʾ��Ϣ����ƽ̨
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
