package chapter05;

import javax.swing.JOptionPane;

public class FuncTest04 {
	public static void display(String[] strs) {
		StringBuilder result = new StringBuilder();
		
		for (String str : strs) {
			result.append(str + "\n");
		}
		
		System.out.println(result);
		
		JOptionPane.showMessageDialog(null, "배열의 원소 값\n\n" + result);
	}
	
	public static void main(String[] args) {
		String[] strs = { "Java", "Oracle", "JSP", "HTML", "CSS", "JavaScript", "jQuery", "SpringBoot", "Python" };
	
		display(strs);
	}
}
