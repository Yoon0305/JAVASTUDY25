package ch10_2_1;

public class PromotionExam {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println("�ڵ�Ÿ�� �� long :" + longValue);
		
		double doubleValue = intValue;
		System.out.println("�ڵ�Ÿ�� �� double :" + doubleValue );
		
		
	}

}
