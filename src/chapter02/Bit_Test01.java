package chapter02;

public class Bit_Test01 {
	public static void main(String[] args) {
		int num1 = 5;  // 0101
		int num2 = 10; // 1010
		
		int result = num1 | num2; 
		System.out.println(result);
		
		result = num1 & num2; 
		System.out.println(result);
		
		result = num1 ^ num2; 
		System.out.println(result);
	}
}
