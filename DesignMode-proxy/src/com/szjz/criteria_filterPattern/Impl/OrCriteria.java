package com.szjz.criteria_filterPattern.Impl;

import java.util.List;

import com.szjz.criteria_filterPattern.interfaces.Criteria;
import com.szjz.criteria_filterPattern.model.Person;

/**
 * 只要满足其中一个标准即可
 * @author 石中君子
 *
 */
public class OrCriteria implements Criteria {
	
	Criteria criteriaOne;
	Criteria criteriaTwo;
	
	public OrCriteria(Criteria criteriaOne, Criteria criteriaTwo) {
		this.criteriaOne = criteriaOne;
		this.criteriaTwo = criteriaTwo;
	}
	
	
	//依次过滤求并集
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = criteriaOne.meetCriteria(persons);
		List<Person> list2 = criteriaTwo.meetCriteria(persons);
		for (Person person : list2) {
			//过滤同时满足两个标准的对象
			if (!list.contains(person)) {				
				list.add(person);
			}
		}
		return list;
	}

}
