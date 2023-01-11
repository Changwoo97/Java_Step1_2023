package chapter03.FOR;

public class ForTest02 {
	public static void main(String[] args) {
		int num = 100;
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		sum = num * (num + 1) / 2;
		System.out.println(sum);
	}
}
