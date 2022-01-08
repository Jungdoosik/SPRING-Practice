package kr.or.iei.person.model.vo;

import java.util.HashSet;

public class PersonSetBeanFactory {

	private HashSet<String> set;

	public PersonSetBeanFactory(HashSet<String> set) {
		super();
		this.set = set;
	}

	public PersonSetBeanFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HashSet<String> getSet() {
		return set;
	}

	public void setSet(HashSet<String> set) {
		this.set = set;
	}
	
	
}
