package chapter02;

public class BitTest02 {
	public static void main(String[] args) {
		int num = 0b0000_0101;
		System.out.println(num);
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println("----------");
		
		int a = 5, b = 2, c = a >> b;
		
		System.out.println(c);
		
		c = a << b;
		System.out.println(c);
	}
}
