package chapter06;

public class StudentMain {
	public static void main(String[] args) {
		// 필드를 이용하여 set
		Student stu1 = new Student();
		stu1.name = "김치";
		stu1.address = "서울시 종로구";
		
		stu1.showStudentInfo();
		System.out.println("---------------");
		
		// 메소드
		Student stu2 = new Student();
		stu2.setName("박수");
		stu2.setAddress("집");
		
		stu2.showStudentInfo();
		System.out.println("------------------");
		
		Student stu3 = new Student("길동", "집2");
		stu3.showStudentInfo();
		System.out.println("------------------");
	}
}
