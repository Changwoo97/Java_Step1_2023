package chapter02;

public class Incre_Test02 {
	public static void main(String[] args) {
		int x = 10, y = 10, z;
		
		System.out.println("---------------");
		x++; ++x;
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		y--; --y;
		System.out.println("y = " + y);
		
		System.out.println("---------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("---------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
