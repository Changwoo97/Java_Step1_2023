package chapter03.IF;

import java.util.Scanner;

public class IfExample07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 > ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println(num1);
		System.out.println();
		
		System.out.print("2 > ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println(num2);
		System.out.println();
		
		if(num2 != 0.0) {
			System.out.println("나눈 값 : " + (num1 / num2));
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		scan.close();
	}
}
