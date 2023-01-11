package chapter06;

import java.util.Calendar;

public class EnumWeekMain {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case Calendar.MONDAY:
			today = Week.MONDAY;
			break;
		case Calendar.TUESDAY:
			today = Week.TUESDAY;
			break;
		case Calendar.WEDNESDAY:
			today = Week.WEDNESDAY;
			break;
		case Calendar.THURSDAY:
			today = Week.THURSDAY;
			break;
		case Calendar.FRIDAY:
			today = Week.FRIDAY;
			break;
		case Calendar.SATURDAY:
			today = Week.SATURDAY;
			break;
		case Calendar.SUNDAY:
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘의 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("백설이와 놉니다.");
		} else {
			System.out.println("강의합니다.");
		}
	}
}
