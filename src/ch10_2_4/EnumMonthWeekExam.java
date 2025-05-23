package ch10_2_4;

import java.util.Calendar;

public class EnumMonthWeekExam {

	public static void main(String[] args) {
		// month와 week의 enum 객체는 생성
		// year는 Calendar.getinstace()를 통해
		// OS상의 연도를 불러와서 출력해보자.
		// 오늘의 연도, 날짜, 요일

		Week today = null;
		Month thisMonth = null;
		
		Calendar cal = Calendar.getInstance();
		// cal이라는 객체에 Calendar instance생성
		
		int year = cal.get(Calendar.YEAR); //연
		thisMonth = Month.May; //월
		int day = cal.get(Calendar.DAY_OF_MONTH); //일
		today = Week.Wednesday; //요일
		
		System.out.println("오늘은"+year+"년"+thisMonth+"월"+day+"일, "+today+"입니다.");
		
	

	}

}
