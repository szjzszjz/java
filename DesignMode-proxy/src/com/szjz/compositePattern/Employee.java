package com.szjz.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式，具有相同特点的对象，可以用同一个特点表示，比如公司的员工（领导也是员工）
 * @author 石中君子
 *
 */
public class Employee {
	
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}



	//添加属下员工
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	//移除属下员工
	public void remove(Employee e) {
		subordinates.remove(e);
	}

	//获取属下员工
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
