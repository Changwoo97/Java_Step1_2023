package chapter07;

public class ThisExam {
	int year, month, day;
	
	public ThisExam(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisExam birth1 = new ThisExam(2022, 12, 27);
		birth1.printThis();
		System.out.println("생년월일: " + birth1.year + "." + birth1.month + "." + birth1.day);
		
		ThisExam birth2 = new ThisExam(2022, 12, 27);
		birth2.printThis();
		birth2.setYear(2023);
		birth2.setMonth(6);
		birth2.setDay(23);
		System.out.println("생년월일: " + birth2.year + "." + birth2.month + "." + birth2.day);
	}
}
