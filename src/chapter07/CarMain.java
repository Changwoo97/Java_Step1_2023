package chapter07;

public class CarMain {
	public static void main(String[] args) {
		// 생성자를 통하여 초기화
		Car car1 = new Car("Black", 2000);
		
		// 멤버변수에 직접 접근해서 초기화 후 출력
		Car car2 = new Car();
		car2.color = "White";
		car2.cc = 2500;
		System.out.println("Color: " + car2.color + ", CC: " + car2.cc);
		
		// 메소드를 이용한 출력
		System.out.println("Color: " + car1.getColor() + ", CC: " + car1.getCc());
	}
}
