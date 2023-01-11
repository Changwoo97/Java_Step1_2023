package chapter05;

import javax.swing.JOptionPane;

class FuncTest01 {
	// 합계 메소드(함수)
	// 접근 한정자: public(공용: 제한없음) / protected(패키지 내에서 공용됨) / private(클래스 내에서만 사용)
	// void: return 없음
	
	// 메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static long sum(long a, long b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	// 실행 담당하는 메소드
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		
		System.out.println(sum(a, b)); 
	}
}
