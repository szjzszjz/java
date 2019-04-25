package com.szjz.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ģʽ��������ͬ�ص�Ķ��󣬿�����ͬһ���ص��ʾ�����繫˾��Ա�����쵼Ҳ��Ա����
 * @author ʯ�о���
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



	//�������Ա��
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	//�Ƴ�����Ա��
	public void remove(Employee e) {
		subordinates.remove(e);
	}

	//��ȡ����Ա��
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
