package ch10_2_1;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 123456789;
		byte byteValue = (byte)intValue;
		
		System.out.println("int 타입 값 출력:" + intValue);
		System.out.println("byte 타입 값 출력:"+ byteValue);
		
		int Kor = 80;
		int Eng = 97;
		int Mat = 88;
		
		int total = Kor+Eng+Mat;
		System.out.println("총점 : " + total);
		
		double avg = total/3;
		System.out.println("평균(자동타입변환) : "+avg);

		avg=(double)total/3;
		System.out.println("평균(강제타입변환) : "+avg);
		
	}

}
