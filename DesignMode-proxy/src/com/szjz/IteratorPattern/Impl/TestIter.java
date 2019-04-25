package com.szjz.IteratorPattern.Impl;

public class TestIter {

	public String names[] = { "Robert", "John", "Julie", "Lora" };
	int index;

	public TestIter() {
		System.out.println("-----------");
	}
	
	public boolean hasNext() {
		if (index < names.length) {
			//System.out.println("index:"+index);
			return true;
		}
		return false;
	}


	public Object next() {
		if (hasNext()) {
			return names[index++];
		}
		return null;
	}

}
