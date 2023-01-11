package chapter03.FOR;

public class ForTest01 {
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//		
		int i;
		System.out.println("1부터 10까지의 수 출력");
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("================");
		
		int j; // index 변수
		int sum = 0; // 누적변수이므로 반드시 초기화 해줌
		for (j = 1; j <= 10; j++) {
			System.out.print(j + " ");
			sum += j;
		}
		System.out.println();
		System.out.println("1부터 10까지의 합: " + sum + "입니다.");
	}
}
