package chapter05;

import java.util.Scanner;

public class Method2 {
	int cnt, num;
	boolean run = true;
	String str = "";
	Scanner scan = new Scanner(System.in);
	Method br = new Method();
	
	void order2() {
		while (run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			
			System.out.print("선택> ");
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				br.makeBread(cnt);
				break;
			case 2:
				break;
			default:
				System.out.println("잘못된 번호 입니다.");
				break;	
			}
		}
	}
}
