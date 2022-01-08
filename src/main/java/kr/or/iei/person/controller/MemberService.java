package kr.or.iei.person.controller;

public class MemberService {

	private MemberDAO mDAO;
	
	
	
	public MemberService() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MemberService(MemberDAO mDAO) {
		super();
		this.mDAO = mDAO;
	}



	public void selectMember() {
		mDAO.selectMember();
	}
}
