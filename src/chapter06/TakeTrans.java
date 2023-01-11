package chapter06;

public class TakeTrans {
	public static void main(String[] args) {
		StdInfo james = new StdInfo("James", 12000);
		StdInfo tom = new StdInfo("Tom", 10000);
		
		Bus bus_1000 = new Bus(1000);
		
		james.takeBus(bus_1000);
		james.showInfo();
		bus_1000.showInfo();
		System.out.println("-------------------------");
		
		Subway subway_3 = new Subway(3);
		tom.takeSubway(subway_3);
		tom.showInfo();
		subway_3.showInfo();
		System.out.println("-------------------------");
		
		Subway subwayGreen = new Subway(2);
		james.takeSubway(subwayGreen);
		james.showInfo();
		subwayGreen.showInfo();
	}
}
