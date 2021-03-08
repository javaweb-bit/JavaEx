package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
//		dateClassEx();
		calendarEx();
	}
	
	//	캘린더 객체
	private static void calendarEx() {
		//	캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();

		//	내부 정보를 얻어올 때는 get(날짜상수)
		System.out.printf("현재: %d년 %d월 %d일%n", 
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,	//	중요: 1월은 0
				now.get(Calendar.DATE));
		
		//	년월일 정보를 알고 있을 때
		custom.set(2012, 8, 24);	//	년, 월 - 1, 일
		System.out.printf("custom: %d년 %d월 %d일%n", 
				custom.get(Calendar.YEAR),
				custom.get(Calendar.MONTH) + 1,
				custom.get(Calendar.DATE));
		
		//	날짜의 연산
		Calendar future = Calendar.getInstance();	//	현재 날짜
		//	100일 뒤로 이동
		future.add(Calendar.DATE, 100);
		System.out.printf("미래: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
		
		//	이 날은 무슨 요일일까?
		//	Calendar.DAY_OF_WEEK : 1(일) ~ 7(토)
		int dow = future.get(Calendar.DAY_OF_WEEK);	//	요일 정보
		System.out.printf("요일:" + dow);
		
		String dowStr;
		
		switch (dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr = "?";
		}
		
		System.out.println(dowStr);
	}
	
	//	날짜 시간
	private static void dateClassEx() {
		//	날짜 얻어오기
		Date now = new Date();	//	현재 날짜와 시간
		System.out.println("현재:" + now.toString());
		
		//	출력 포맷의 변경
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);	//	포맷 정의
		System.out.println("FULL:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM:" + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT:" + df.format(now));
		
		//	형식을 지정할 때 -> SimpleDateFormat
		//	2021년 03월 08일 13시 20분 __초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("SDF:" + sdf.format(now));
	}

}
