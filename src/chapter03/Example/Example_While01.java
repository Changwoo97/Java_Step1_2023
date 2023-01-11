package chapter03.Example;

import java.util.Scanner;

public class Example_While01 {
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
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 금액 : " + balance);
				System.out.print("입금할 금액을 입력하세요 : ");
				int deposit = scan.nextInt();

				if (deposit < 0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				} else {
					balance += deposit;
				}
			} else if (selection == 2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 금액 : " + balance);
				System.out.print("출금할 금액을 입력하세요 : ");
				int withdrawal = scan.nextInt();

				if (withdrawal < 0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				} else {
					if (balance - withdrawal < 0) {

					} else {
						System.out.println("잔액이 부족합니다.");
					}
				}
			} else if (selection == 3) {
				System.out.println("");
			} else if (selection == 4) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;
			} else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다.");
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");
	}
}
