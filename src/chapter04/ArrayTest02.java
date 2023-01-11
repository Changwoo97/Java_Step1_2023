package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {
	public static void main(String[] args) {
		var students = new String[3];
		var phones = new String[3];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = JOptionPane.showInputDialog("이름");
			phones[i] = JOptionPane.showInputDialog("전화번호");
			
			System.out.println("이름: " + students[i] + " 전화번호: " + phones[i]);
		}
	} 
}
