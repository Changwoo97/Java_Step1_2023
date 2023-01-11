package chapter02;

public class Logic_Test01 {
	public static void main(String[] args) {
		char a = 'A', b = 'B';
		boolean c;
		
		c = (true || true) && false;
		System.out.println(c);
		
		c = a < b && a == b;
		System.out.println(c);
		
		c = a < b || a == b;
		System.out.println(c);
	}
}
