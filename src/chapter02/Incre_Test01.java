package chapter02;

public class Incre_Test01 {
	public static void main(String[] args) {
		int a, b, c;
		a = 10; b = 20; c = 3;
		System.out.println("++a : " + ++a);
		System.out.println("a++ : " + a++);
		System.out.println("후위연산 : " + a);
		System.out.println("==============");
		System.out.println("c++ : " + c++);
		System.out.println("후위연산 : " + c);
		
		System.out.println("==============");
		
		System.out.println("++a + b++ : " + (++a + b++));
		System.out.println("후위연산 : " + b);
		System.out.println("==============");
		
		System.out.println("++a : " + ++a);
		System.out.println("b++ : " + b++);
		System.out.println("후위연산 : " + b);
		System.out.println("++a + b++ : " + (++a + b++));
	}
}
