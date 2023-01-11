package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));

			int res = num1 / num2;
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("Error 후 컴파일 => 프로그램 종료");
	}
}
