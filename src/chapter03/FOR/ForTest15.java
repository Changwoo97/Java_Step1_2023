package chapter03.FOR;

import java.util.Scanner;

public class ForTest15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행을 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("열을 입력하세요 : ");
		int b = scan.nextInt();
		System.out.println();
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
	}
}
