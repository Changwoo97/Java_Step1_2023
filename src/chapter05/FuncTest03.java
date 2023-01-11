package chapter05;

public class FuncTest03 {
	public static void swap(int x, int y) {
		// 교체 알고리즘
		int temp = x;
		x = y;
		y = temp;
		
		System.out.printf("swap() 결과 값: a = %d, b = %d\n", x, y);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.printf("swap() 호출 전: a = %d, b = %d\n", a, b);
		System.out.println("=============================");
		swap(a, b);
		System.out.println("=============================");
		System.out.printf("swap() 호출 후: a = %d, b = %d\n", a, b);
	}
}
