package ch10_2_2; //review 필요 (수식 이해)

public class ForSumExam1 {

	public static void main(String[] args) {
		// for문을 이용하되, 최대값을 키보드로 입력
		// 마지막으로 합계 도출까지.
		int sum = 0; // 합계 도출을 위한 변수 지정
		int i = 1;
		for( ; i<=500 ; i++) {
		sum = sum + i ;
		}//for문 종료
		System.out.println("1~" + (i-1) + "까지의 합 :"+ sum);
		
		// i 값의 범위를 수정해도 print 문까지 수정 필요가 없어짐
		// 연산 되는 과정은 ?
		
		
		
		
	}//main 종료

}//class 종료
