package chapter03.FOR;

import java.util.Scanner;

public class ForTest17 {
	public static void main(String[] args) {
		// 정수를 입력 받아서 입력된 수만큼 ★ 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("> ");
		int n = scan.nextInt();
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n - (i + 1); j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
