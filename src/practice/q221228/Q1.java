package practice.q221228;

public class Q1 {
	public static void main(String[] args) {
		int i = 10;
		long l = i; // int형에서 long형으로 자동 형 변환
		System.out.printf("int: %d -> long: %d\n", i, l);
		
		float f = 10f;
		double d = f; // float에서 double형으로 자동 형 변환
		System.out.printf("float: %.2f -> double: %.2f\n", f, d);
	}
}
