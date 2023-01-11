package chapter03.IF;

import java.util.Scanner;

public class IfExample11 {
	public static void main(String[] args) {
		// 데이터베이스
		String ID = "soldesk";
		int PW = 221227;
		
		// Scanner scan
		Scanner scan = new Scanner(System.in);
		
		// ID 받기
		System.out.print("ID: ");
		String inputID = scan.nextLine();
		
		if(ID.equals(inputID)) {
			// 비번입력 받고
			System.out.print("PW: ");
			int inputPW = Integer.parseInt(scan.nextLine());
			
			// 비번확인 코드
			if(PW == inputPW) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 다름");
			}
		} else {
			System.out.println("아이디 없음");
		}
		
		scan.close();
	}
}
