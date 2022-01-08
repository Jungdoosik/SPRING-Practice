package kr.or.iei.person.model.vo;

import java.util.HashMap;

public class PersonMapBeanFactory {
	
	private HashMap<String,String> map;

	public PersonMapBeanFactory(HashMap<String, String> map) {
		super();
		this.map = map;
	}

	public PersonMapBeanFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	

}
