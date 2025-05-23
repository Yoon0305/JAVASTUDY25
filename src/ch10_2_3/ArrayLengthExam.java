package ch10_2_3;

public class ArrayLengthExam {

	public static void main(String[] args) {

		int[] scores = {83,90,87};// 정수 변수 scores에 {}안의 값 설정
		
		int sum = 0; // 정수 변수 sum의 초기값 설정
		
		for (int i=0 ; i<scores.length ; i++) {
			// scores 0자리 값~ 2자리값까지 합계를 구함.
			sum += scores[i];
		}//for문 종료
System.out.println("총합 : "+ sum);

double avg = (double) sum / scores.length;
System.out.println("평균 : "+avg);


	}//main method 종료

}//class 종료
