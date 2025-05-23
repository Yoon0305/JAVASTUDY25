package ch10_2_3;

public class ArrayExamSumAvg {

	public static void main(String[] args) {
		// 총합, 평균을 구하는 배열
		int sum = 0; // 총점 저장을 위한 변수
		float average = 0F; //-> 평균 저장을 위한 변수
		
		int[] scores = {100,88,100,100,90};
		//5명의 점수 나열
		for (int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}//for문 종료
		
		
		average = sum / (float)scores.length;
		
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " + average);
		
	}//main method 종료

}//class 종료
