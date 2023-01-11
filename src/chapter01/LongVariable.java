package chapter01;

public class LongVariable {
	public static void main(String[] args) {
//		int num1 = 12345678900;
		long num2 = 12345678900L;
		long num3 = 1000; // long형의 64비트이지만 L로 선언을 안했으므로 int로 인식
		
		int level;
		level = 10;
		
		System.out.println(num2 + num3);
		System.out.println(num2 + num3);
	}
}
