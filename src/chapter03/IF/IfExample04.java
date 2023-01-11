package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample04 {
	public static void main(String[] args) {
		// 전시관의 입장료는
		// 미취학 아동은 1000원
		// 초등학생은 2000원
		// 중.고등학생은 3500원
		// 성인은 5000원

		// swing 사용하여 입력 받기

		int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));

		if (age < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		// if
		int charge = 5000; // 성인 요금

		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 3500;
			System.out.println("중.고등학생입니다.");
		}

		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}
