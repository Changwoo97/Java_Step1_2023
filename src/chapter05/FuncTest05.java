package chapter05;

public class FuncTest05 {
	public String channel; // 멤버변수
	public int channelInt;
	public int volume;
	
//	public FuncTest05() { 
//		channel = "10";
//	}
//	
	public void channelUp(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다.");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다.");
	}
	
	// 오버로딩(다형성 만족)
	public void channelChange(String channel) {
		System.out.println("TV 채널을 " + channel + "로 바꿉니다.");
	}
	
	// 오버로딩(다형성 만족)
	public void channelChange(int channelInt) {
		System.out.println("채널을 " + channelInt + "로 바꿉니다.");
	}
	
	public static void main(String[] args) {
		FuncTest05 func = new FuncTest05();

		func.channelUp(10);
		func.channelDown(10);
		func.channelChange("KBS");
		func.channelChange(2);
	}
}
