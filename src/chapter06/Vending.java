package chapter06;

public class Vending {
	private Can[] cans;
	private int money;

	public void init()
	{
		cans = new Can[5];
		cans[0] = new Can("환타", 1000);
		cans[1] = new Can("콜라", 1100);
		cans[2] = new Can("사이다", 1200);
		cans[3] = new Can("스프라이트", 1300);
		cans[4] = new Can("웰치스", 1400);
	}
	
	public void showCans(int money) { 
		this.money = money;
		
		for (Can can : cans) {
			if (can.getPrice() <= money) {
				System.out.println(can.getName() + ", " + can.getPrice());
			}
		}
	}
	
	public void outCan(String name) {
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getName().equals(name)) {
				System.out.println(cans[i].getName() + "를 선택하셨습니다.");
				System.out.println("잔액 : " + (money - cans[i].getPrice()));
			}
		}
	}
}
