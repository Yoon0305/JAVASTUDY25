package ch10_2_4; //이 개념이 add 메서드 안에 괄호안에 들어가는
							   // 내용이 무엇인지 이해가 되고 응용할 수 있도록 해야함.

public class AddIntArrayClassExam {

	public static void main(String[] args) {
		// 
		int total1 = add(new int[] {70,80,90} );
		int total2 = add(new int[] {60,70,80} );
		int total3 = add(new int[] {90,80,50} );
		System.out.println("1 : "+total1);
		System.out.println("2 : "+total2);
		System.out.println("3 : "+total3);
	}

	public static int add(int[] scores) {
		int sum = 0; // 총합을 구하고싶어서 add()메서드를 만든거라
						  // 총합에 들어갈 sum 변수의 초기화 먼저.
		for(int i=0; i<3 ; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
