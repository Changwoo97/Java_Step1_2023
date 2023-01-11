package chapter04;

import javax.swing.JOptionPane;

public class CharArray01 {
	public static void main(String[] args) {
		String[] strs = { "홍길동", "김유신", "장길산", "이순신" };
		String res = "";
		
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			
			res += str + "\n"; 
		}
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "[영웅들]\n" + res);
	}
}
