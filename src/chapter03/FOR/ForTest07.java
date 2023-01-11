package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 > ");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		// if문의 조건에 0보다 크면서 11보다 작은 수
		if (0 < a && a < 11) {
			for (int i = 0; i < a; i++) {
				System.out.println("Java 프로그래밍!");
			}
		} else {
			System.out.println("입력값이 잘 못 되었습니다.");
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}
}
