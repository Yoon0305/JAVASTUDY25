package ch10_2_2;

public class IfNestedExam {//class ����

	public static void main(String[] args) {//main method ����
	 int score =(int)(Math.random()*20)+81;
		
	 System.out.println("���� ������ : " + score);
	 String grade;
	 
		if(score>=90) {//if, 90 �̻� ����
			if(score>=95) {//A+ ���� ���� ����
				grade = "A+";
			}//A+ ���� ���� ����
			
			else { //A ���� ���� ����
				grade ="A";
			}//A ���� ���� ����
		}//if, 90 �̻� ����
			else {//90�̸� ���� 
				if(score>=85) {//B+ ���� ���� ����
			grade = "B+";
			}//B+ ���� ���� ����
			else {//B ���� ���� ����
				grade = "B";
			}//B ���� ���� ����
				
		} // 90�̸� ����
		
		System.out.println("���� : "+grade);
	}//main method ����

}//class ����
