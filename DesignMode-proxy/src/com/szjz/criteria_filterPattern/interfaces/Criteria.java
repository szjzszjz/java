package com.szjz.criteria_filterPattern.interfaces;

import java.util.List;

import com.szjz.criteria_filterPattern.model.Person;

/**
 * ��׼�ӿ� ͨ����׼���й��� 
 * @author ʯ�о���
 *
 */
public interface Criteria {
	
	//�����׼����Ⱥ
	public List<Person> meetCriteria(List<Person> persons);

}
