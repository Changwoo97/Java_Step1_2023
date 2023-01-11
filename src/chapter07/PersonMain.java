package chapter07;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("AAA");
		System.out.println("name: " + p.name);
		
		System.out.println();
		
		Person p2 = new Person("BBB", 100f, 100f);
		System.out.println("name: " + p2.name);
		System.out.println("height: " + p2.height);
		System.out.println("weight: " + p2.weight);
		
		System.out.println();
		
		Person p3 = new Person("CCC", 170f, 70f);
		System.out.println("name: " + p3.name);
		System.out.println("height: " + p3.height);
		System.out.println("weight: " + p3.weight);
	}
}
