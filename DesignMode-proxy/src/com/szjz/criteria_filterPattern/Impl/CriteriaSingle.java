package com.szjz.criteria_filterPattern.Impl;

import java.util.ArrayList;
import java.util.List;

import com.szjz.criteria_filterPattern.interfaces.Criteria;
import com.szjz.criteria_filterPattern.model.Person;

/**
 * 满足单身的标准
 * @author 石中君子
 *
 */
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("single")) {
				list.add(person);
			}
		}
		return list;
	}

}
