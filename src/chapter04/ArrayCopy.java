package chapter04;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		
		for (int num : array1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		printLine(15);
		
		for (int num : array2) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		printLine(15);
		
		int length = (array1.length < array2.length) 
				? array1.length : array2.length;
		System.arraycopy(array1, 0, array2, 0, length);
		
		for (int num : array1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		printLine(15);
		
		for (int num : array2) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		printLine(15);
	}
	
	private static void printLine(final int NUM) {
		for (int i = 0; i < NUM; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
