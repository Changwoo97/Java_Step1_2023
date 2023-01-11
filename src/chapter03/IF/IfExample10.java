package chapter03.IF;

import java.util.Scanner;

public class IfExample10 {
	public static void main(String[] args) {
		String ID = "soldesk510";
		int PW = 221227510;

		// Scanner scan이라는 인스턴스 변수 선언
		Scanner scan = new Scanner(System.in);

		// ID라는 변수로 아이디 받기
		System.out.print("ID: ");
		String id = scan.nextLine();

		// PW라는 변수로 비밀번호 받기(String) => 숫자로 받되 String
		System.out.print("PW: ");
		String pw = scan.nextLine();

		// int형으로 형변환
		int _pw = Integer.parseInt(pw);

		// 중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
//		if (!ID.equals(id)) {
//			System.out.println("아이디 없음");
//		} else if (PW != _pw) {
//			System.out.println("비밀번호 다름");
//		} else {
//			System.out.println("로그인 성공");
//		}
		
		if(!ID.equals(id) || (PW != _pw)) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}
		
		scan.close();
	}
}
