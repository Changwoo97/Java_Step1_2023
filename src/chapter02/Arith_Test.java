package chapter02;

public class Arith_Test {
	public static void main(String[] args) {
		// 총점과 평균을 출력
		
		int mathScore = 96;
		int engScore = 87;
		
		// 총점
		int sum = mathScore + engScore;
		System.out.println("총점: " + sum);
		
		// 평균 + - * /
		float avg = sum / 2f;
		System.out.println("평균: " + avg);
	}
}
