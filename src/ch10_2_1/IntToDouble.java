package ch10_2_1;

public class IntToDouble {

	public static void main(String[] args) {
		// int타입과 float타입은 같은 32bit 사용하지만
		// float이 소숫점을 사용하기 때문에 값에 변조가 일어남
		// float보다 범위가 큰 double을 사용하여 해결해 보자.
		
		int num1= 123456780;
		int num2= 123456780;
		double num3 = num2;
		num2 = (int)num3;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		
		int result = num1 - num2 ;
		System.out.println("double으로 다녀온 후에 num2 값 변경안됨");
		System.out.println("num1-num2:"+result);

	}

}
