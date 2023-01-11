package chapter06;

public class Student {
	int id;
	public String name;
	int grade;
	String address;
	
	// 오버로딩된 생성자가 있을 시 디폴트를 사용하기 위해서는 반드시 명시한다.
	// 즉, 생략이 불가능
	public Student() {
		
	}
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(name + ", " + address);
	}
}
