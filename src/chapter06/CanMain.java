package chapter06;

import java.util.Scanner;

public class CanMain {
	public static void main(String[] args) {
		System.out.print("돈을 투입하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int money = scan.nextInt();
		Vending vendor = new Vending();
		vendor.init();
		vendor.showCans(money);
		
		System.out.print("음료를 선택하세요 : ");
		String select = scan.next();
		vendor.outCan(select);
	}
}
