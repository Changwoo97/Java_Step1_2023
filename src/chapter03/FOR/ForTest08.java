package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {
	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오.
		Scanner scan = new Scanner(System.in);
		StringBuilder three = new StringBuilder();
		StringBuilder five = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%02d. 정수를 입력하세요 > ", i);
			int num = scan.nextInt();
			if(num % 3 == 0) {
				three.append(num + " ");
			}
			if(num % 5 == 0) {
				five.append(num + " ");
			}
		}
		
		System.out.println();
		System.out.println("3의 배수: " + three);
		System.out.println("5의 배수: " + five);
	}
}
