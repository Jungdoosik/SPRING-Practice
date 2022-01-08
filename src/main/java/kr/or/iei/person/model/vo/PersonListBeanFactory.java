package kr.or.iei.person.model.vo;

import java.util.ArrayList;

public class PersonListBeanFactory {

	private ArrayList<Person> list;
	
	public PersonListBeanFactory(ArrayList<Person> list) {
		super();
		this.list = list;
	}

	public PersonListBeanFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	
	
	
}
