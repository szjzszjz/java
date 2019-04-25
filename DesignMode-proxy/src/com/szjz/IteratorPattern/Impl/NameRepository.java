package com.szjz.IteratorPattern.Impl;

import com.szjz.IteratorPattern.interfaces.Container;
import com.szjz.IteratorPattern.interfaces.Iterator;

public class NameRepository implements Container {
	public String names[] = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	
	// ÄÚ²¿Àà
	class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				System.out.println("index:"+index);
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
