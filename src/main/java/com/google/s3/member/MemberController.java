package com.google.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member/**")  //나머지 데이터가 안들어 간다면 밸류 생략 무방
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("test")
	public void test() {
		memberService.test();	
	}
	
	
	
	
	//로그인
	
	//회원가입
	
	
}
