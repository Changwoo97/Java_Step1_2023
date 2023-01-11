package chapter07;

import javax.swing.JOptionPane;

public class ThisTestMain {
	public static void main(String[] args) {
		ThisTest r1 = new ThisTest();
		r1.move();
		r1.move();
		System.out.println("------------------");
		r1.robotAge();
		System.out.println("------------------");
		int r_speed = Integer.parseInt(JOptionPane.showInputDialog("로봇 속도"));
		int r_age = Integer.parseInt(JOptionPane.showInputDialog("로봇 나이"));
		String r_name = JOptionPane.showInputDialog("로봇 이름");
		String r_num = JOptionPane.showInputDialog("로봇 번호");
		
		ThisTest r2 = new ThisTest(r_speed, r_age, r_name, r_num);
		int speed = r2.getSpeed();
		System.out.println("속도: " + speed);
		System.out.println("나이: " + r2.getAge());
		System.out.println("이름: " + r2.getRobotName());
		System.out.println("번호: " + r2.getRobotNum());
		
		r2.move();
		r2.robotName();  
		r2.robotAge();
	}
}
