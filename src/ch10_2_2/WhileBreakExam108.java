package ch10_2_2;

public class WhileBreakExam108 {

	public static void main(String[] args) {
		
int i = 0;
while(true) {
	int num = (int)(Math.random()*45) + 1;
	System.out.println("오늘의 로또번호 : "+num);
	i++;
	if(i==6) {
		System.out.println("프로그램 종료");
		break;
	}// 안쪽 if 문종료
	 // 로또 번호 순서 = i임
	 // 로또 번호 추출 -> i에 +1 -> i가 6이 아니면 다시 번호 추출
	 // 로또번호1,i=1 -> 로또번호2,i=2 ... 로또번호6,i=6
	 // if 조건 true로 print값 출력 후 break 걸림.
}// while 문 종료
		
		
	}//main method 종료

}//class 종료
