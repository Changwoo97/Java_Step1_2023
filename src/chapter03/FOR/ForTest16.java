package chapter03.FOR;

public class ForTest16 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%-10s\t", ("[" + i + "단]"));
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (i * j));
			}
			System.out.println();
		}
	}
}
