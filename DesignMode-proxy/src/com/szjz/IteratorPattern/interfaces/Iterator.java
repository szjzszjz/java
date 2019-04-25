package com.szjz.IteratorPattern.interfaces;

/**
 * 迭代器
 * @author 石中君子
 *
 */
public interface Iterator {
	
	//是否有下一个
	public boolean hasNext();
	//下一个元素
	public Object next();
}
