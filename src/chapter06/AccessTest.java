package chapter06;

public class AccessTest {
	// 필드
	private int aa;
	public int bb;
	int cc;

	// 디폴드 생성자

	// 메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void display() {
		System.out.println("aa값 : " + aa);
		System.out.println("bb값 : " + bb);
		System.out.println("cc값 : " + cc);
	}

	public static void main(String[] args) {
		var obj = new AccessTest();
		obj.setAa(1); obj.setBb(2); obj.setCc(3);
		obj.display();
	}
}
