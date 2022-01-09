package kr.or.kh.computer.model.vo;

import org.springframework.stereotype.Component;

@Component(value="sony")
public class SonySpeaker implements Speaker{

	
	public SonySpeaker() {
		System.out.println("-------sony 객채 생성");
	}
		
	
	@Override
	public void soundUp() {
		System.out.println("SonySpeaker ----- 볼륨업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("SonySpeaker ----- 볼륨다운");
		
	}

}
