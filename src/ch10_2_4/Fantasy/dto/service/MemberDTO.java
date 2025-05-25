package ch10_2_4.Fantasy.dto.service;

import java.util.ArrayList;
import java.util.List;

public class MemberDTO { 
/* 회원가입 class + 회원 정보 db
	필요 구성 : 이름, ssn, id, pw, 닉네임, 이메일*/
	
	public List<String> ids = new ArrayList<>();
	public List<String> pws = new ArrayList<>();
	public List<String> nicknames = new ArrayList<>();
	
	public void updateMemInfo(String userId, String userPw, String userNickname) {
		ids.add(0, userId);
		pws.add(0, userPw);
		nicknames.add(0, userNickname);
	}
	
	public List<String> MemInfoList(){
		return ids;
		
	}
	
		//필드//
	public String name; // 이름 : 회원 가입, id-pw 찾기
	public String ssn;	  // 주민등록번호 : 회원 가입, id-pw 찾기
	public String id ;	  // id : 회원 가입, 로그인, id 찾기(?)
	public String pw;	  // pw : 회원 가입, 로그인, pw 찾기
	public String nickName;	// 닉네임 : 회원가입, 인게임 표시용
	public String email;		//이메일주소 : 회원가입, id 찾기
	
	// -> id 찾을 때 이름 + 이메일주소 / pw 찾을 때 이름+id
	
	
		//생성자//

	
	
		//메서드//
	
	
}//MemberDTO class 종료
