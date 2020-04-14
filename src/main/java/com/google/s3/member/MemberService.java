package com.google.s3.member;

public class MemberService {
	
	private MemberDAO memberDAO;

	public MemberService() {
		
	}
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO= memberDAO;
	}
	
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	//외부에서는 꺼내가지 않으므로 getter는 필요 없음
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}

}
