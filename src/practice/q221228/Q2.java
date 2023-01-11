package practice.q221228;

public class Q2 {
	public static void main(String[] args) {
		float f = 123.123f;
		int i = (int)f;
		System.out.printf("float: %.3f -> int: %d\n", f, i);
		
		double d = 123456.123456;
		long l = (long)d;
		System.out.printf("double: %.6f -> long: %d\n", d, l);
	}
}
