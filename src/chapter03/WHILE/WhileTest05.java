package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0, sum = 0;
		
		// 0을 입력하면 종료
		while (true) {
			System.out.print("> ");
			int num = scan.nextInt();
			if(num == 0) break;
			sum += num;
			cnt++;
		}
		
		System.out.println("sum: " + sum + " / cnt: " + cnt + " = avg: " + ((double)sum / cnt));
		System.out.println("프로그램 종료");
	}
}
