package kr.or.kh.computer.model.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	
	@Autowired
	@Qualifier(value="sony")
	private Speaker speaker;
	
	

	public Computer() {
		System.out.println("컴퓨터 객체 생성");
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	

}
