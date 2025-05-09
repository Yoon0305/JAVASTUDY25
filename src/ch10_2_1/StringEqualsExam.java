package ch10_2_1;

public class StringEqualsExam {

	public static void main(String[] args) {
		
		String strval1 = "Yoon";
		String strval2 = "Yoon";
		String strval3 = new String("Yoon");
		System.out.println(strval1==strval2);
		System.out.println(strval1==strval3);
		
		boolean eq1 = strval1.equals(strval3);
		System.out.println("val1과 val3의 eq 사용결과:" +eq1);
		

	}

}
