package chapter03.Example;

public class Example_For01 {
	public static void main(String[] args) {
		// 1 ~ 100까지의 수중 3의 배수의 합
		final int MULTIPLE = 3;
		final int END = 100;
		
		int sum = 0;
		for (int i = MULTIPLE; i <= END; i += MULTIPLE) {
			sum += i;
		}
		System.out.println(sum);
	}
}
