package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");

			System.out.print("선택 > ");
			int selection = scan.nextInt();

			if (selection == 1) {
			}

			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}
