package chapter03.FOR;

public class ForTest04 {
	public static void main(String[] args) {
		// 0 ~ 100까지의 수중 홀수값만 합하기
		
		int total = 0;
		for (int i = 1; i <= 100; i += 2) {
			total += i;
		}
		System.out.println(total);
		
		total = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0) continue;
			total += i;
		}
		System.out.println(total);
		
		System.out.println("====================");
		System.out.println();
		
		for(int i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
	}
}
