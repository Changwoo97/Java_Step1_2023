package chapter04;

import java.util.Scanner;

public class TwoDimension02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] javaScores = new int[2][3];

		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.printf("(%d, %d) > ", i, j);
				javaScores[i][j] = scanner.nextInt();
			}
		}

		System.out.println();

		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.print(javaScores[i][j] + " ");
			}
			System.out.println();
		}
	}
}
