package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {
	public static void main(String[] args) {
		int side;
		int height;
		int area;
		
		side = Integer.parseInt(JOptionPane.showInputDialog("side"));
		height = Integer.parseInt(JOptionPane.showInputDialog("height"));

		var cap = new Encapsulation();
		System.out.println(cap.cal_Area(side, height));
		JOptionPane.showMessageDialog(null, cap.cal_Area(side, height));
	}
}
