package ch10_2_4; 

import java.util.Scanner;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// 배열 복사 연습
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("이름을 입력하세요");
		System.out.print(">>>");
		String newMemName = input.next();
		
		
	String[] oldStrArray = {"김","이",null,"박"};
	String[] newStrArray = new String[6];
	// old { 김,이,박} -> new {null,null,null,null,null,null} -> new(copied) {김,이,박,null,null,null}
	
	System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
	//복사 범위 설정만 완료된 상황
	
	for(int i=0; i<newStrArray.length; i++) {
		System.out.println(newStrArray[i]);
	while(run) {
		if (newStrArray[i]==null) {
			newStrArray[i]=newMemName;
			
		}
	}
	// i가 0~ newStrArray 길이만큼 돌면서 newStrArray[i]의 값을 보여줘.
	// 여기서 null 에 새 정보를 넣는 방법..?
			
	}//for 종료
	

	}//main method 종료

}//class종료
