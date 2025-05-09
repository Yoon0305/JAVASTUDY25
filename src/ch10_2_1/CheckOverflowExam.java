package ch10_2_1; // Review 필요

public class CheckOverflowExam {//public class시작

	public static void main(String[] args) {//main method 시작 
		
		Double result = safeAdd(70.4,90.8);
		System.out.println(result);

	} // main method 종료

	public static double safeAdd(double left,double right)
	{ // if right 시작
		if (right>0)
		{// if left 시작
			if (left> (Integer.MAX_VALUE - right)) {
		} // if left 종료
			throw new ArithmeticException("Overflow");
		} // if right 종료
	 else { // else시작
		if (left < (Integer.MIN_VALUE - right)) { // if right2시작
			throw new ArithmeticException("Overflow");
			}//if right2 종료
	}// else 종료
	
		return left + right; 
		
	} // safeAdd 종료
	
} //class 종료
	
		

