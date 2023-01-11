package chapter04;

public class ArrayTest03 {
	public static void main(String[] args) {
		var iArr = new int[] { 10, 20, 30, 40, 50 };
		
		System.out.println("배열의 원소 출력");
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		for (int num : iArr) {
			System.out.print(num + " ");
		}
	}
}
