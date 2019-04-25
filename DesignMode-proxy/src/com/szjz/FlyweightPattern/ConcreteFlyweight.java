package com.szjz.FlyweightPattern;

/**
 * �������Ԫ��ɫ
 * 
 * @author ʯ�о���
 *
 */
public class ConcreteFlyweight implements Flyweight {

	private String key;

	public ConcreteFlyweight(String key) {
		this.key = key;
		System.out.println("������Ԫ" + key + "��������");
	}

	@Override
	public void operation(UnsharedConcreteFlyweight state) {
		System.out.print("������Ԫ" + key + "�����ã�");
		System.out.println("����Ԫ��Ϣ��:" + state.getInfo());
	}

}
