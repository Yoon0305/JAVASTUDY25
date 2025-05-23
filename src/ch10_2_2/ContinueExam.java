package ch10_2_2;

public class ContinueExam {

	//continue는 for, while, do-while에서만 사용
	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++) {
			if(i%2 !=0) {//if문 내부에서 continue발생
				//i나누기 2가 0이 아닌 즉, 홀수가 true면
				//증감식으로 돌아가서 다시 연산 진행.
				continue;
			}//if문 종료
			System.out.println(i);
		}//for문 종료
		

	}//main 종료

}//class 종료
