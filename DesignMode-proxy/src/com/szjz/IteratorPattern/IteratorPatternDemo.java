package com.szjz.IteratorPattern;

import com.szjz.IteratorPattern.Impl.NameRepository;
import com.szjz.IteratorPattern.Impl.TestIter;
import com.szjz.IteratorPattern.interfaces.Iterator;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。 迭代器模式属于行为型模式
 * 
 * @author 石中君子
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
