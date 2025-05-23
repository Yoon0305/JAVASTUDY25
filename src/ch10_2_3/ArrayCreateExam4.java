package ch10_2_3;

public class ArrayCreateExam4 {

	public static void main(String[] args) {
		
		double[] arr2 = new double[3];
		
		for(int i=0 ; i<3 ; i++) {
			System.out.println("arr2["+i+"]");
		}//for 종료
		
arr2[0] = 10.0;
arr2[1] = 20.0;
arr2[2] = 30.0;

for(int i=0 ; i<3 ; i++) {
	System.out.println("arr2["+i+"]" + arr2[i]);
} //for 종료

String[] arr3 = new String[3];
for(int i=0 ; i<3 ; i++) {
	System.out.println("arr3["+i+"]"+ arr3[i]);
}
		
		arr3[0] = "윤제석";
		arr3[1] = "김기원";
		arr3[2] = "자바";	
		for(int i=0 ; i<3 ; i++) {
			System.out.println("arr3["+i+"]"+arr3[i]);
		}
		
		

	} // main method 종료

} //class 종료
