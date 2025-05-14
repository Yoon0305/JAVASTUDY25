package ch10_2_2;

public class IfNestedExam {//class 시작

	public static void main(String[] args) {//main method 시작
	 int score =(int)(Math.random()*20)+81;
		
	 System.out.println("현재 점수는 : " + score);
	 String grade;
	 
		if(score>=90) {//if, 90 이상 시작
			if(score>=95) {//A+ 범위 지정 시작
				grade = "A+";
			}//A+ 범위 지정 종료
			
			else { //A 범위 지정 시작
				grade ="A";
			}//A 범위 지정 종료
		}//if, 90 이상 종료
			else {//90미만 시작 
				if(score>=85) {//B+ 범위 지정 시작
			grade = "B+";
			}//B+ 범위 지정 종료
			else {//B 범위 지정 시작
				grade = "B";
			}//B 범위 지정 종료
				
		} // 90미만 종료
		
		System.out.println("학점 : "+grade);
	}//main method 종료

}//class 종료
