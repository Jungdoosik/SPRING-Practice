package kr.or.kh.computer.model.vo;

import org.springframework.stereotype.Component;

@Component(value="apple")
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		
		System.out.println("----- AppleSpeaker 객체 생성 -----");
		
	}
	public void soundUp() {
		
		System.out.println("AppleSpeaker ----- 볼륨업");
		
	}
	public void soundDown() {
	
		System.out.println("AppleSpeaker ----- 볼륨다운");
		
	}
}
