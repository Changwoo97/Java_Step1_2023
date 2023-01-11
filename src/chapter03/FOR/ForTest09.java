package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {
	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받다 
		// 총점과 평균을 구하시오
		// 단, 평균은 실수로 출력할 것
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? > ");
		int num = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " > ");
			sum += scan.nextInt();
		}
		
		System.out.println();
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ((double)sum / num));
	}
}
