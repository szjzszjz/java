package com.szjz.IteratorPattern;

import com.szjz.IteratorPattern.Impl.NameRepository;
import com.szjz.IteratorPattern.Impl.TestIter;
import com.szjz.IteratorPattern.interfaces.Iterator;

/**
 * ������ģʽ��Iterator Pattern���� Java �� .Net ��̻����зǳ����õ����ģʽ��
 * ����ģʽ����˳����ʼ��϶����Ԫ�أ�����Ҫ֪�����϶���ĵײ��ʾ�� ������ģʽ������Ϊ��ģʽ
 * 
 * @author ʯ�о���
 *
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}

		/*for (TestIter iter = new TestIter(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println(name + iter);
		}*/

	}

}
