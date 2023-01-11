package chapter04;

public class ArraySumTest {
	public static void main(String[] args) {
		int[] scores = { 98, 90, 87 };

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			int score = scores[i];
			System.out.printf("score[%d]: %d\n", i, score);
			sum += score;
		}

		System.out.println();

		double avg = (double) sum / scores.length;
		System.out.printf("Sum: %d\n", sum);
		System.out.printf("Avg: %.2f\n", avg);
	}
}
