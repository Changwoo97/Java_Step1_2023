package chapter06;

public class Bus {
	private int number;
	private int money;
	private int count;
	
	public Bus(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money; // 버스 수입 증가
		count++;
	}
	
	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d원입니다.\n", number, count, money);
	}
}
