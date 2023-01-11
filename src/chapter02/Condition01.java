package chapter02;

public class Condition01 {
	public static void main(String[] args) {
		int a = 10, b = 15;
		boolean result = ++a >= b ? true : false;
		System.out.println(result);
		
		int n1 = 10, n2 = 20;
		char result2 = ++n1 == n2 ? 'Y' : 'N';
		System.out.println(result2);
	}
}
