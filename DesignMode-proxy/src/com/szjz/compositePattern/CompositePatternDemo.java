package com.szjz.compositePattern;

import java.util.List;

/**
 * 组合模式，就是在一个对象中包含其他对象，
 * 这些被包含的对象可能是终点对象（不再包含别的对象），
 * 也有可能是非终点对象（其内部还包含其他对象，或叫组对象），
 * 我们将对象称为节点，即一个根节点包含许多子节点，
 * 这些子节点有的不再包含子节点，而有的仍然包含子节点，以此类推。
 * 很明显，这是树形结构，终结点叫叶子节点，非终节点（组节点）叫树枝节点，
 * 第一个节点叫根节点。同时也类似于文件目录的结构形式：文件可称之为终节点，目录可称之为非终节点（组节点）。
 * @author 石中君子
 *
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
//		一级
		Employee CEO = new Employee("John", "CEO", 30000);

//		二级
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

//		三级
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		
		CEO.add(headMarketing);
		CEO.add(headSales);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		
		//打印所有的员工
		List<Employee> list = CEO.getSubordinates();
		for (Employee employee : list) {
			System.out.println(CEO.getDept() +" :" + employee);
			List<Employee> subordinates = employee.getSubordinates();
			for (Employee employee2 : subordinates) {
				System.out.println(employee.getDept() + " :" + employee2);
			}
		}
	}

}
