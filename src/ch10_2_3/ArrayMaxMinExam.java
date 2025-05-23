package ch10_2_3;

public class ArrayMaxMinExam {

	public static void main(String[] args) {
		// 배열 값 중에서 최대와 최소를 구하는 예시
		int [] scores = {21,35,96,100,55,43,48};
		
		int max = scores[0];
		int min = scores[0];
		
		for(int i=1; i<scores.length; i++) {
			
			if(scores[i] > max) {
				max = scores[i]; 
			}//if문 종료 
			else if (scores[i] < min) {
				min = scores[i];
			}// else if 종료
			
		}//for문 종료
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}//main method 종료

}//class 종료
