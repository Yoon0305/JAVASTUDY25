package ch10_2_2;

public class BreakOutterExam {

	public static void main(String[] args) {
		
		for(char upper='A' ; upper <= 'Z' ; upper++) {
			Outter : for(char lower='a' ; lower <= 'z' ; lower++) {
			
				System.out.println(upper + "-" + lower);
				if(lower=='d') {
					break Outter;
				} //if문 종료
				
			}// Outter 종료	
			// break Outter를 통해 같은 형식의 수식으로도
			// 안쪽과 바깥쪽의 규칙이 다르도록 설정이 가능함.
			// 실제로 main for문은 A~Z까지 도는 반면
			// outter측 의 a~z는 d까지 오면 계산이 중단되도록
			// 설정하여 main에 break전까지의 outter값만 붙음.
			
		}//for문 종료
		

	}//main 종료

}// class 종료
