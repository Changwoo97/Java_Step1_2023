package chapter02;

public class Example01 {
	public static void main(String[] args) {
		final int PEAR = 5, APPLE = 7, ORANGE = 5;
		
		int total = PEAR + APPLE + ORANGE;
		System.out.println("하루에 생산되는 총 과일의 갯수 : " + total);
		
		float avg = total / 24f;
		System.out.println("시간당 전체 과일의 평균 생산 갯수 : " + avg);
	}
}
