package chapter03.IF;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요(단 입력은 Scanner클래스 사용)
        //소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그램밍언어활용(pro), 정보시스템 구축(os)
		//한 과목이라도 8개 미만, 평균이 60점 미만인 경우 불합격입니다로 출력
		//그렇지 않으면 합격입니다으로 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. 소프트웨어 설계: ");
		int soft1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("2. 소프트웨어 개발: ");
		int soft2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("3. 데이터베이스 구축: ");
		int db = Integer.parseInt(scan.nextLine());
		
		System.out.print("4. 프로그래밍언어 활용: ");
		int pro = Integer.parseInt(scan.nextLine());
		
		System.out.print("5. 정보시스템 구축: ");
		int os = Integer.parseInt(scan.nextLine());
		
		
		boolean cond1 = (soft1 < 8 || soft2 < 8 || db < 8 || pro < 8 || os < 8);
		boolean cond2 = (soft1 + soft2 + db + pro + os) < 60;
		
		if(cond1 || cond2) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}
		
		scan.close();
	}
}
