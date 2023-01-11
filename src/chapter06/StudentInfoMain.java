package chapter06;

public class StudentInfoMain {
	public static void main(String[] args) {
		var stuKim = new StudentInfo();
		
		stuKim.id = 1;
		stuKim.grade = 1;
		stuKim.address = "aaaa";
		
		stuKim.setName("홍길동");
		
		String name = stuKim.getName();
		System.out.println(name);
	}
}
