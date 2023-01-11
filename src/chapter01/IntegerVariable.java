package chapter01;

public class IntegerVariable {
	public static void main(String[] args) {
		byte bVal = 20;
		short sVal = 10;
		
		int result = bVal + sVal;
		
		System.out.println("두 수의 합: " + result);
		System.out.println("두 수의 합: " + (bVal + sVal));
	}
}
