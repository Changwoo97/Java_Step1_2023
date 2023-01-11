package chapter06;

public class ComputerMain {
	public static void main(String[] args) {
		Computer pc = new Computer();
		
		System.out.println(pc.sum1(new int[] { 1, 2, 3 }));
		
		System.out.println(pc.sum2(1, 2, 3));
		
		System.out.println(pc.sum2(1, 2, 3));
	}
}
