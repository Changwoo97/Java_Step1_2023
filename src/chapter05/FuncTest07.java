package chapter05;

import java.util.Scanner;

public class FuncTest07 {
	public FuncTest07() { }
	
//	public static String eduStep(int edu) {
//		if (edu == 1) return "1단계";
//		if (edu == 2) return "2단계";
//		if (edu == 3) return "3단계";		
//		
//		return "단계없음";
//	}
	
	public static void eduStep(int edu) {
		if (0 < edu && edu < 4) {
			System.out.printf("현재 스터디 단계는 step%d 입니다.\n", edu);
			return;
		}
		
		System.out.println("단계없음");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int number = scan.nextInt();
		eduStep(number);
//		var step = eduStep(number);
//		System.out.println(step);
	}
}
