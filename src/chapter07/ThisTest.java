package chapter07;

public class ThisTest {
	private int speed;
	private int age;
	private String robotName;
	private String robotNum;

	public ThisTest() { }

	public ThisTest(int speed, int age, String robotName, String robotNum) {
		this.speed = speed;
		this.age = age;
		this.robotName = robotName;
		this.robotNum = robotNum;
	}
	
	public void move() {
		speed += 20;
		System.out.println("RobotSpeed: " + speed);
	}
	
	public void stop() {
		speed = 0;
		System.out.println("RobotSpeed: " + speed);
	}
	
	public void robotAge() {
		age++;
		System.out.println("RobotAge: " + age);
	}
	
	public void robotName() {
		System.out.println("RobotNam: " + robotName);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getRobotNum() {
		return robotNum;
	}

	public void setRobotNum(String robotNum) {
		this.robotNum = robotNum;
	}
}
