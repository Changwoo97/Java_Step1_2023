package chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest07 {
	public static void main(String[] args) {
//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum += num;
//		} while (++num <= 10);
//		System.out.println("1부터 10까지의 합: " + sum);
		
		int num1;
		int num2;
		
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if(num1 == num2) {
				System.out.println("인증성공");
				break;
			}
		} while (num1 != num2);
	}
}
