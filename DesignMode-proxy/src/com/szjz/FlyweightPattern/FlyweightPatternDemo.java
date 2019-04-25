package com.szjz.FlyweightPattern;

/**
 * ��Ԫģʽ������ԭ������ģʽ 
 * ��Ԫģʽ��FlyWeight�������ù�������Ч��֧�ִ���ϸ���ȵĶ���
 * ��Ԫģʽ��Flyweight Pattern����Ҫ���ڼ��ٴ���������������Լ����ڴ�ռ�ú�������ܡ�
 * �������͵����ģʽ���ڽṹ��ģʽ�����ṩ�˼��ٶ��������Ӷ�����Ӧ������Ķ���ṹ�ķ�ʽ��
 * @author ʯ�о���
 *
 */
public class FlyweightPatternDemo {
	
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweight = factory.getFlyweight("a");
//		Flyweight flyweight01 = factory.getFlyweight("a");
		flyweight.operation(new UnsharedConcreteFlyweight("��һ�ε���a"));
		flyweight.operation(new UnsharedConcreteFlyweight("��er�ε���a"));
		flyweight.operation(new UnsharedConcreteFlyweight("��san�ε���a"));
	}

}
