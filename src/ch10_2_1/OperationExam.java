package ch10_2_1;

public class OperationExam {

	public static void main(String[] args) {
		
		int x = 10;
		x++;	
	
	System.out.println("10�� ++ ���׿����� ��� :" + x);
		
		x--;
	System.out.println("10�� -- ���׿����� ���:"+x);
		
		int y = 20;
		int result = x+y;
	System.out.println("x+y=" + result);
		
		boolean result1 = (result>10) ? true : false;
		
	System.out.println("result>10 ��� : " + result1);
		
		String result2 = (result<50) ? "�۴�" : "ũ��" ;
		System.out.println("result<50 ��� : " +result2);
		
		
		int x1 = 10 * 15;
		System.out.println("10 x 15 =" + x1);
		double x2 = 10/4D ;
		System.out.println("10/4 =" +x2);
		double x3 = 34 % 3D;
		System.out.println("34�� 3���� ���� ������:" + x3);
		
		int odd1 = 29;
		int div = odd1 %2;
		String resultOdd = (div == 1) ? "Ȧ��" : "¦��";
		System.out.println("29�� Ȧ���ΰ� ¦���ΰ�?:"+ resultOdd);
		
		int multi5 = 28;
		int div5 = multi5 % 5 ;
		String resultDiv5 = (div5 == 0) ? "5�ǹ��" : "5�� ����ƴ�";
		System.out.println("28�� 5�� ����ΰ�? : " + resultDiv5);
		
		int k = 12;
		k++;
		++k;
		System.out.println("k++, ++k �����? : "+k);
		
		int m = 18;
		m--;
		--m;
		System.out.println("m-, --m �����? : "+m);
		
		int g;
		g= ++k;
		System.out.println("k�� ����� : " +k);
		System.out.println("g�� ����� : " +g);
		
		
		
		
		
		
	
		
	}

}
