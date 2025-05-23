package ch10_2_4;

public class AdvancedForEachExam {

	public static void main(String[] args) {

		int scores [] = {95, 71, 84, 93, 87};
		
		int sum =0;
		for( int i : scores) {
			sum += i;
		}
		
	System.out.println(sum);
	
	
	String name[] ={"엠비씨", "아카데미", "컴퓨터", "교육센터"};
	for (String i : name) {
		if(name[1]) {
			continue;
		}
		System.out.print(i);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main method 종료

}//class 종료
