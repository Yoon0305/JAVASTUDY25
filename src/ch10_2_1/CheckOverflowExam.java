package ch10_2_1; // Review �ʿ�

public class CheckOverflowExam {//public class����

	public static void main(String[] args) {//main method ���� 
		
		Double result = safeAdd(70.4,90.8);
		System.out.println(result);

	} // main method ����

	public static double safeAdd(double left,double right)
	{ // if right ����
		if (right>0)
		{// if left ����
			if (left> (Integer.MAX_VALUE - right)) {
		} // if left ����
			throw new ArithmeticException("Overflow");
		} // if right ����
	 else { // else����
		if (left < (Integer.MIN_VALUE - right)) { // if right2����
			throw new ArithmeticException("Overflow");
			}//if right2 ����
	}// else ����
	
		return left + right; 
		
	} // safeAdd ����
	
} //class ����
	
		

