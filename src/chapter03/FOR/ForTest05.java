package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {
	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수부터 100까지의 합을 출력하시오;
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		int start = scan.nextInt();
		
		int sum = 0;
		for(int i = start; i <= 100; i++) {
			sum += i;
		}
		System.out.println(start + "부터 100까지의 합: " + sum);
				
		// 1부터 10까지 반복하면서 10개의 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력 
		// 단, 입력받은 수가 0이면 무시
		
		int count = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " > ");
			int num = scan.nextInt();
			if((num != 0) && (num % 2 == 0)) count++;
		}
		System.out.println("입력받은 수중 짝수 갯수: " + count);
		
		scan.close();
	}
}
