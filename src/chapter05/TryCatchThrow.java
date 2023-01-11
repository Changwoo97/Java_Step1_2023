package chapter05;

import java.util.Scanner;

public class TryCatchThrow {
	public static void fun() throws Exception {
		try {
			System.out.println("fun() 메서드");
			throw new Exception();
		} catch (RuntimeException e) {
			
		} catch (Exception e) {
			System.out.println("catch 문장");
			throw e;
		} finally { // 에러를 잡지 못해도 또는 에러를 잡아도 무조건 수행해야하는 코드
			System.out.println("finally 문장");
		}
	}
	
	public static void main(String[] args) {	
		// static이므로 바로 호출 가능해야 하지만 
		// throws Exception 메소드 이므로 try catch로 호출
		try (var scan = new Scanner(System.in)) {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}
	}
}
