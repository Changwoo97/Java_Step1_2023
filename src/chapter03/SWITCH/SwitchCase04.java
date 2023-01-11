package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {
	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스 변수 scan에 값을 입력 받음
		//A, a -> 우수회원 / B, b -> 일반회원 / 나머지 -> 고객
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요(A, B, C): ");
		char grade = scan.nextLine().charAt(0);
		scan.close();
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("고객");
			break;
		}
	}
}
