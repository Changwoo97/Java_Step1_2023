package chapter06;

public class StdInfo {
	public String name;
	public int grade;
	public int money;
	
	public StdInfo(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은 잔액은 %d원 입니다.\n", name, money);
	}
}
