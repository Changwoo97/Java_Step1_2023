package chapter06;

import java.util.LinkedList;
import java.util.Scanner;

public class BaseballGame {
	Scanner scan = new Scanner(System.in);
	int com1 = 0, com2 = 0, com3 = 0;

	public BaseballGame() {
		init();
	}

	public void init() {
		var linkedList = new LinkedList<Integer>();
		
		for (int i = 1; i < 10; i++) {
			linkedList.add(i);
		}
		
		int index = (int) (Math.random() * linkedList.size());
		com1 = linkedList.remove(index);
		
		index = (int) (Math.random() * linkedList.size());
		com2 = linkedList.remove(index);
		
		index = (int) (Math.random() * linkedList.size());
		com3 = linkedList.remove(index);
		
//		com1 = (int) (Math.random() * 9) + 1;
//		
//		do {
//			com2 = (int) (Math.random() * 9) + 1;
//		} while (com1 == com2);
//		
//		do {
//			com3 = (int) (Math.random() * 9) + 1;
//		} while (com3 == com1 || com2 == com3);
	}

	public String check() {
		try {
			System.out.println("1 ~ 9 사이의 수를 입력하세요.");
			System.out.print("첫번째 수를 입력하세요: ");
			int user1 = scan.nextInt();
			System.out.print("두번째 수를 입력하세요: ");
			int user2 = scan.nextInt();
			System.out.print("세번째 수를 입력하세요: ");
			int user3 = scan.nextInt();

			int strike = 0, ball = 0;

			// 만약에 com1과 사용자가 입력할 첫번째(user1) 숫자가 같으면 stirke
			// 첫번째(user1) 숫자가 com2 또는 com3랑 숫자만 맞으면 ball
			if (user1 == com1) {
				strike++;
			} else if (user1 == com2 || user1 == com3) {
				ball++;
			}

			if (user2 == com2) {
				strike++;
			} else if (user2 == com3 || user2 == com1) {
				ball++;
			}

			if (user3 == com3) {
				strike++;
			} else if (user3 == com1 || user3 == com2) {
				ball++;
			}

			if (strike == 3) {
				return "WIN";
			} else if (strike > 0 || ball > 0) {
				return strike + " Strike, " + ball + " Ball";
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		
		return "OUT";
	}
}
