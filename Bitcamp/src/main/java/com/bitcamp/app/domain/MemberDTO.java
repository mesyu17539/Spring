package com.bitcamp.app.domain;


import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberDTO {
	//어소시에이션 방식
	private String id, pass, name,ssn,phone, email,profile,addr;
	private AccountDTO account;
	private MobileDTO mobile;
	@Override
	public String toString() {
		return "회원정보 [ID : " + id + ", 비밀번호 : " + pass + ", 이름 : " + name + ", 주민번호(생년월일-첫번째 번호) " + ssn + ", 전화번호 : " + phone
				+ ", 이메일 : " + email + ", 프로필사진 : " + profile + ", 주소 : " + addr 
//				+(account==null? " ":",계좌번호 : "+account.getAccountNum()+"]")
//				+(mobile==null? "]\n":",전화번호 : "+mobile.getPhone()+",가입일 : "+mobile.getRegDate()+"]\n")
				;
	}
}
