package chapter03.FOR;

import java.util.Scanner;

public class ForTest10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int i, sum = 0;
		for(i = 0; ; i++) {
			if(sum > num) break;
			sum += i;
		}
		
		System.out.println((i - 1) + "번째까지의 총합 : " + (sum - i));
	}
}
