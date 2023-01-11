package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	// 필드 또는 멤버변수
	private String std_num;
	private String std_name;
	private int java, oracle, spring;

	// 디폴트 생성자(생략가능)

	// 매서드
	public void sum() {
		int total = java + oracle + spring; // 지역변수
		System.out.println("총합계 : " + total);
	}

	public void avg() {
		int avg = (java + oracle + spring) / 3;
		System.out.println("평균  : " + avg);
	}

	public static void main(String[] args) {
		SungJuk rec = new SungJuk();
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("성명");

		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바점수 입력"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클점수 입력"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링점수 입력"));

		System.out.printf("학번 - %s | 성명 - %s\n", rec.std_num, rec.std_name);
		System.out.println("-----------------------------");
		rec.sum();
		rec.avg();
	}
}
