package chapter04.Example;

import javax.swing.JOptionPane;

public class MyLotto {
	private static final int MAX = 20;
	
	private static final String MSG1 = "원하는 로또 구매횟수를 입력하세요.";
	private static final String MSG2 = "잘못된 입력입니다. 다시 입력하세요.";
	private static final String MSG3 = "로또 구매 최대 횟수를 초과하였습니다. 다시 입력하세요.";
	
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int number;
				
		String msg = MSG1;
		
		while (true) {
			number = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			if (number <= 0) {
				msg = MSG2;
			} else if (MAX < number) {
				msg = MSG3;
			} else { 
				break;
			}
		}
		
		System.out.println("==== 이번주 로또 예상번호 ====");
		
		for (int i = 0; i < number; i++) {
			System.out.printf("[%02d] : ", i + 1);
			
			for (int j = 0; j < 6; j++) {
				lotto[j] = (int)(Math.random() * 45.0) + 1;
				boolean isOverlap = false;
				
				for (int k = 0; k < j; k++) {
					if (lotto[j] == lotto[k]) {
						isOverlap = true;
						break;
					}
				}
				
				if (isOverlap) {
					j--;
				} else {
					System.out.printf("%2d ", lotto[j]);
				}
			}
			System.out.println();
			
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = 0;
			}
		}
	}
}
