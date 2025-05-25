package ch10_2_4.Fantasy;

import java.util.Scanner;

//dto import
import ch10_2_4.Fantasy.dto.ingame.CharClassDTO;
import ch10_2_4.Fantasy.dto.ingame.CharacterDTO;
import ch10_2_4.Fantasy.dto.ingame.ItemDTO;
import ch10_2_4.Fantasy.dto.ingame.RideDTO;
import ch10_2_4.Fantasy.dto.service.MemberDTO;

//function import
import ch10_2_4.Fantasy.function.InitialPhase;
import ch10_2_4.Fantasy.function.CharSelectionPhase;
import ch10_2_4.Fantasy.function.InGamePhase;



public class FantasyExam {
	//실제 실행될 main class
	// 필드 -> main()method가 있는 field는 static용으로 만든다.
	public static Scanner input = new Scanner(System.in); //FantasyExam class에서 입력하는 Scanner객체 생성
	
	public static MemberDTO[] memberDTOs = new MemberDTO[10];
	public static CharacterDTO[] characterDTOs = new CharacterDTO[5];
	public static CharClassDTO[] charclassDTOs = new CharClassDTO[5];
	public static RideDTO[] rideDTOs = new RideDTO[3];
	public static ItemDTO[] itemDTOs = new ItemDTO[2];
	
	public static MemberDTO loginState ;
	
	
	
	public static void main(String[] args) {
		
/* FantasyExam main 구조  
 * 가입자 : 10 | 생성 가능 캐릭터 : 5 | 캐릭터 직업 수 : 5 | 탈것 종류 : 3 | 아이템 종류 : 2
 
1. 초기화면
	1) 로그인
	2) 회원가입
	
		1-1) id ,pw 입력 | 초기화면 가기 -> 검증(실패:1-2) -> 로그인성공 -> 캐릭터 선택 화면
		1-2) 로그인 화면 반복 | 초기화면 가기
		
		2-1) 이름, ssn, id, pw, 닉네임, 이메일 입력 -> (중복검증) -> 가입성공 -> 초기화면 

2. 캐릭터 선택 화면
	1) 캐릭터 선택
	2) 캐릭터 생성
		                                  
		1-1) 계정이 갖고있는 캐릭터 목록[] 나열(캐릭터 보유x:2-1) -> 선택 -> 게임화면
		
		2-1) 전체 캐릭터 클래스 목록[] 나열  -> 생성 옵션 선택 -> 생성 확인(y/n) -> 캐릭터 선택 화면
		
3. 게임화면
		1) 캐릭터 상태 확인
		2) 전투
		3) 아이템 사용
		4) 탈 것 조종
		5) 게임 종료
		
			1-1) 상태 기본값 표시 -> 아이템 사용 시 변화값 return받아야 함.
			2-1) RandomExam 응용 
					사용자 (공격,아이템) / 몬스터 (공격,수비 랜덤값 도출) -> 둘 중 하나 hp0 전투종료 
			3-1) 아이템 목록[] 표시 -> 아이템 사용 -> 사용 아이템 갯수-1 + 변화된 상태 표시 
			4-1) carExam의 응용 (부르기, 가속, 감속, 정지, 보내기)
		    5-1) 종료 확인 -> 종료                              																					*/
		
		System.out.println("===== Fantasy 게임을 시작합니다. =====");
		InitialPhase initialPhase = new InitialPhase();
		initialPhase.initialSelect();
		
		
		
		System.out.println("===== 캐릭터 선택 화면입니다. =====");
		CharSelectionPhase charSelectPhase = new CharSelectionPhase();
		
		
		
		System.out.println("===== 게임에 입장합니다. =====");
		InGamePhase inGamePhase = new InGamePhase();
		
		
	}//FantasyExam main method 종료


}//FantasyExam class 종료
