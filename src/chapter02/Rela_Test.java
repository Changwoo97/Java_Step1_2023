package chapter02;

public class Rela_Test {
	public static void main(String[] args) {
		char a = 'A', b = 'B';
		boolean AL = a < b;
		System.out.println(AL);
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println("num1 > num2  : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
	}
}
