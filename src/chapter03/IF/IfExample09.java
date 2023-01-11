package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample09 {
	public static void main(String[] args) {
		String ID = "soldesk";
		int PW = 221227;
		
		String id = JOptionPane.showInputDialog("아이디");
		int pw = Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
		
		if(ID.equals(id)) {
			if(PW == pw) {
				System.out.println(ID + "님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
	}
}
