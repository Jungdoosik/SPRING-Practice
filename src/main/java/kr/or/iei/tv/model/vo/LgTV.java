package kr.or.iei.tv.model.vo;

public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("lg ---전원을켠다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("lg ---전원을끈다");
		
	}

	@Override
	public void soundOn() {
		System.out.println("lg ---볼륨 업");
		
	}

	@Override
	public void soundOff() {
		System.out.println("lg ---볼륨다운");
		
	}

}
