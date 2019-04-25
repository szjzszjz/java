package com.szjz.criteria_filterPattern.Impl;

import java.util.List;

import com.szjz.criteria_filterPattern.interfaces.Criteria;
import com.szjz.criteria_filterPattern.model.Person;

/**
 * �����׼��� ����
 * @author ʯ�о���
 *
 */
public class AndCriteria implements Criteria {
	
	Criteria criteriaOne;
	Criteria criteriaTwo;
	
	public AndCriteria(Criteria criteriaOne, Criteria criteriaTwo) {
		this.criteriaOne = criteriaOne;
		this.criteriaTwo = criteriaTwo;
	}
	

	//���ι��� �󽻼�
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = criteriaOne.meetCriteria(persons);
		List<Person> list2 = criteriaTwo.meetCriteria(list);
		return list2;
	}

}
