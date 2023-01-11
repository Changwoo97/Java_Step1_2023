package chapter04.Example;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		final int POP_MAX = 100;

		Scanner scan = new Scanner(System.in);

		int[] scores = new int[0];
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------------------");

			System.out.print("선택> ");
			int selection = scan.nextInt();

			switch (selection) {
			case 1: // 학생수
				System.out.print("학생수> ");
				int pop = scan.nextInt();
				if (pop < 0) {
					System.out.println("잘못된 입력입니다.");
				} else if (POP_MAX < pop) {
					System.out.println("최대값를 초과하였습니다.");
				} else {
					scores = new int[pop];
				}
				break;
			case 2: // 점수입력
				if (scores.length <= 0) {
					System.out.println("학생수를 먼저 입력하세요.");
					break;
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> ", i + 1);
					int score = scan.nextInt();
					if (0 <= score && score <= 100) {
						scores[i] = score;
					} else {
						System.out.println("잘못된 점수입니다. 다시 입력하세요.");
						i--;
					}
				}
				break;
			case 3: // 점수리스트
				if (scores.length <= 0) {
					System.out.println("학생수를 먼저 입력하세요.");
					break;
				}

				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i + 1, scores[i]);
				}
				break;
			case 4: // 분석
				if (scores.length <= 0) {
					System.out.println("학생수를 먼저 입력하세요.");
					break;
				}

				int sum = 0, max = 0;

				for (int i = 0; i < scores.length; i++) {
					int score = scores[i];
					sum += score;
					max = (max < score) ? score : max;
				}

				double avg = (double) sum / scores.length;
				
				System.out.printf("최고점수: %d\n", max);
				System.out.printf("총점: %d\n", sum);
				System.out.printf("평균: %.2f\n", avg);
				break;
			case 5: // 종료
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

			System.out.println();
		}

		System.out.println("프로그램 종료");
	}
}
