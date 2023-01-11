package chapter06;

import java.util.Scanner;

public class GuGuDanMain {
	public static void main(String[] args) {
		
		GuGuDan gd = new GuGuDan();
		
		int num;
		System.out.print("출력할 단을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		gd.showTable(num);
	}
}
