package chapter04.Example;

public class Example01 {
	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하시오.
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
				};
		
		int total = 0, count = 0;
		
		for (int[] row : array) {
			int sum = 0;
			
			for (int column : row) {
				sum += column;
				count++;
			}
			
			total += sum;
			
			double avg = (double)sum / row.length;
			System.out.printf("Sum: %d, Avg = %.2f\n", sum, avg);
		}
		
		System.out.println();
		
		double avg = total / count;
		System.out.printf("[Total] Sum: %d, Avg: %.2f\n", total, avg);
	}
}
