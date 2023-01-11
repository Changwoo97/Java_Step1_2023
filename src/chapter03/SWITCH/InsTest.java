package chapter03.SWITCH;

class clsA {
	void func() {
		System.out.println("2023년 1월 첫 주 월요일 입니다.");
	}
}

class clsB extends clsA {
	@Override
	void func() {
		System.out.println("AAA");
	}
}

public class InsTest {
	public static void main(String[] args) {
		//clsB의 인스턴스 변수
		 clsB objB = new clsB();
 
		 if(objB instanceof clsA) {
			 System.out.println("Yes");
			 objB.func();
		 } 
		 
		 if(objB instanceof clsB) {
			 System.out.println("Yes");
		 }
	}
}
