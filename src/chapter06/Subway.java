package chapter06;

public class Subway {
	private int line;
	private int money;
	private int count;

	public Subway(int line) {
		this.line = line;
	}

	public void take(int money) {
		this.money += money;
		count++;
	}
	
	public void showInfo() {
		System.out.printf("지하철 %d호산 승객은 %d명이고, 수입은 %d원입니다.\n", line, count, money);
	}
}
