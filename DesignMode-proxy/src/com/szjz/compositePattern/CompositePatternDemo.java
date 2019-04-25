package com.szjz.compositePattern;

import java.util.List;

/**
 * ���ģʽ��������һ�������а�����������
 * ��Щ�������Ķ���������յ���󣨲��ٰ�����Ķ��󣩣�
 * Ҳ�п����Ƿ��յ�������ڲ��������������󣬻������󣩣�
 * ���ǽ������Ϊ�ڵ㣬��һ�����ڵ��������ӽڵ㣬
 * ��Щ�ӽڵ��еĲ��ٰ����ӽڵ㣬���е���Ȼ�����ӽڵ㣬�Դ����ơ�
 * �����ԣ��������νṹ���ս���Ҷ�ӽڵ㣬���սڵ㣨��ڵ㣩����֦�ڵ㣬
 * ��һ���ڵ�и��ڵ㡣ͬʱҲ�������ļ�Ŀ¼�Ľṹ��ʽ���ļ��ɳ�֮Ϊ�սڵ㣬Ŀ¼�ɳ�֮Ϊ���սڵ㣨��ڵ㣩��
 * @author ʯ�о���
 *
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
//		һ��
		Employee CEO = new Employee("John", "CEO", 30000);

//		����
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

//		����
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
		
		
		//��ӡ���е�Ա��
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
