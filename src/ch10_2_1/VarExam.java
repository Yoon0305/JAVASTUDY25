package ch10_2_1;

public class VarExam {

	public static void main(String[] args) {
	int x = 1;
	char y = 65;
	char z = 'A';

			System.out.println("int x =" + x);
			System.out.println("char y =" + y);
			System.out.println("char z =" + z);
			
	// char z1 = 'b';
	
	int x1 ;
	x1 = 10 ;
	System.out.println(x1);
	
	
	int Korean,Math,English,Total,Average ;
	
	Korean = 80;
	Math = 70;
	English = 60;
	Total = Korean + Math + English ;
	Average = Total/3;
	
	System.out.println("국어 : " + Korean);
	System.out.println("수학 : " + Math);
	System.out.println("영어 : " + English);
	System.out.println("총점 : " + Total);
	System.out.println("평균 : " + Average);
	
	char firstname1 = '김';
	char firstname2 = '이';
	
	System.out.println("성 : " + firstname1);
	System.out.println("성 : " + firstname2);
	
	int literal1 = 75;
	int literal2 = 075;
	int literal3 = 0b0011;
	int literal4 = 0xA;
	
	System.out.println("10진수 75 : " + literal1);
	System.out.println("8진수 75 : " + literal2);
	System.out.println("2진수 0011 : " + literal3);
	System.out.println("16진수 A : " + literal4);

	
	
	}
}
