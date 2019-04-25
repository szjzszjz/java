package com.szjz.criteria_filterPattern.Impl;

import java.util.List;

import com.szjz.criteria_filterPattern.interfaces.Criteria;
import com.szjz.criteria_filterPattern.model.Person;

/**
 * ֻҪ��������һ����׼����
 * @author ʯ�о���
 *
 */
public class OrCriteria implements Criteria {
	
	Criteria criteriaOne;
	Criteria criteriaTwo;
	
	public OrCriteria(Criteria criteriaOne, Criteria criteriaTwo) {
		this.criteriaOne = criteriaOne;
		this.criteriaTwo = criteriaTwo;
	}
	
	
	//���ι����󲢼�
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = criteriaOne.meetCriteria(persons);
		List<Person> list2 = criteriaTwo.meetCriteria(persons);
		for (Person person : list2) {
			//����ͬʱ����������׼�Ķ���
			if (!list.contains(person)) {				
				list.add(person);
			}
		}
		return list;
	}

}
