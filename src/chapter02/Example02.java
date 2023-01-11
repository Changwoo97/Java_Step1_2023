package chapter02;

public class Example02 {
	public static void main(String[] args) {
		final double PI = 3.14;
		
		double num1 = 10.0;
		double result = PI * num1 * num1;
		
		System.out.println("반지름 : " + num1);
		System.out.println("원의 넓이 : " + result);
	}
}
