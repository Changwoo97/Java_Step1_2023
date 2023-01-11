package chapter01;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 30;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
	}
}
