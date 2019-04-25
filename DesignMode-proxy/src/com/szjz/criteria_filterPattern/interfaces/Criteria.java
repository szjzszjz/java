package com.szjz.criteria_filterPattern.interfaces;

import java.util.List;

import com.szjz.criteria_filterPattern.model.Person;

/**
 * 标准接口 通过标准进行过滤 
 * @author 石中君子
 *
 */
public interface Criteria {
	
	//满足标准的人群
	public List<Person> meetCriteria(List<Person> persons);

}
