package chapter06;

public class MyDateMain {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.year = 2022;
		date.month = 12;
		date.day = 27;
		
		System.out.printf("%d년 %d월 %d일\n", date.year, date.month, date.day);
	}
}
