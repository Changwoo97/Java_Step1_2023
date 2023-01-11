package chapter02;

public class Logic_Test02 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean flag;
		
		System.out.println("-------- AND ---------");
		flag = (num1 > 10) && (num2 > 20);
		System.out.println("false && false : " + flag);
		
		flag = (num1 > 10) && (num2 > 0);
		System.out.println("false && true : " + flag);
		
		flag = (num1 > 0) && (num2 > 20);
		System.out.println("true && false : " + flag);
		
		flag = (num1 > 0) && (num2 > 0);
		System.out.println("true && true : " + flag);
		
		
		System.out.println("-------- OR ---------");
		flag = (num1 > 10) || (num2 > 20);
		System.out.println("false || false : " + flag);
		
		flag = (num1 > 10) || (num2 > 0);
		System.out.println("false || true : " + flag);
		
		flag = (num1 > 0) || (num2 > 20);
		System.out.println("true || false : " + flag);
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println("true || true : " + flag);
		
		
		System.out.println("-------- NOT ---------");
		flag = (num1 != num2);
		System.out.println(flag);
		
		flag = !(num1 > 0);
		System.out.println(flag);
	}
}
