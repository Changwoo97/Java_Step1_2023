package chapter07;

public class Encapsulation {
	private int side;
	private int height;
	
	public Encapsulation() {
		side = 0;
		height = 0;
	}
	
	public int cal_Area(int s, int h) {
		side = s;
		height = h;
		
		return s * h;
	}
}
