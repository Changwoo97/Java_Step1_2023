package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Outter: while (true) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요 > ");
			
			int num = scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("출력하기를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("삭제하기를 선택하셨습니다.");
				break;
			case 4:
				break Outter;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}
