package ch10_2_1;

public class CastingExam {

	public static void main(String[] args) {
		
		int intValue = 123456789;
		byte byteValue = (byte)intValue;
		
		System.out.println("int Ÿ�� �� ���:" + intValue);
		System.out.println("byte Ÿ�� �� ���:"+ byteValue);
		
		int Kor = 80;
		int Eng = 97;
		int Mat = 88;
		
		int total = Kor+Eng+Mat;
		System.out.println("���� : " + total);
		
		double avg = total/3;
		System.out.println("���(�ڵ�Ÿ�Ժ�ȯ) : "+avg);

		avg=(double)total/3;
		System.out.println("���(����Ÿ�Ժ�ȯ) : "+avg);
		
	}

}
