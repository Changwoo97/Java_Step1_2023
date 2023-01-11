package chapter05;

import java.util.Scanner;

public class Method {
	// 멤버변수(=필드)
	
	// 생성자 생략
	
	//메소드
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	} // method1
	
	void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완료되었습니다.");
	} // method2
	
	void makeBread(int count, String bread) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + bread + "을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 " + bread + "이 모두 완료되었습니다.");
	} // method3
	
	void order() {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			
			System.out.print("선택> ");
			int selection = scan.nextInt();
			
			switch (selection) {
			case 1:
				selection1(scan);
				break;
			case 2:
				selection2(scan);
				break;
			default:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	} // order method
	
	private void selection1(Scanner scan) {
		System.out.print("주문할 빵의 갯수 : ");
		int count = scan.nextInt();
		makeBread(count);
	}
	
	private void selection2(Scanner scan) {
		System.out.print("주문할 빵의 갯수 : ");
		int count = scan.nextInt();
		
		scan.nextLine(); // 버퍼에 남아있는 '\n' 제거
		
		System.out.print("주문할 빵의 종류 : ");
		String bread = scan.nextLine();
		makeBread(count, bread);
	}
}
