package com.szjz.prototypePattern.shape;

//CloneNotSupportedException  不實現Cloneable报异常
public abstract class Shape implements Cloneable {

	private String id;
	
	protected String type;//只有子类可以访问该属性

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	public void draw() {}

	
	//创建clone
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
