package chapter05;

public class FuncTest08 {
	// 멤버변수(필드)
	
	// 디폴트 생성자
	
	// 메소드 : 재귀함수
	public static int recur(int n) {
		if (n < 2) {
			return 1;
		}
		
		return n * recur(n - 1);
		
//		int result;
//		System.out.println(n + " ");
//		
//		if(n == 1) {
//			return 1;
//		} else {
//			result = n * recur(n - 1);
//		}
//		
//		// return 1; 정상 종료는 아니지만 오류없이 끝남 
//		return result; // 정상 종료 되었으나 넘어갈 값이 없음
	}
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("메소드 호출");
		int res = recur(x);
		System.out.println(x + "! = " + res);
	}
}
