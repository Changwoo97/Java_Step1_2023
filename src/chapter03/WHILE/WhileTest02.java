package chapter03.WHILE;

public class WhileTest02 {
	public static void main(String[] args) {
//		int i = 1;
//		
//		while (i <= 10) {
//			System.out.print(i++ + " ");
//		}
		
		int num = 0;
		int sum = 0;
		
		while (num++ < 10) {
			sum += num;
		}
		System.out.println("현재의 num값: " + num);
		System.out.println("1 ~ 10까지의 합: " + sum);
	}
}
