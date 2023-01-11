package chapter06;

public class GuGuDan {
	// 메소드
	public void showTable(int num) {
		System.out.println(num + "단");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}
}
