package chapter06;

public class Start {
	public enum Result {
		UP, SUCCESS, DOWN
	}
	
	private int random;
	private int count;
	
	public Start() {
		init();
	}
	
	public void init() {
		random = (int)(Math.random() * 50) + 1;
		count = 0;
	}
	
	public Result check(int number) {
		count++;
		
		if (number < random) {
			return Result.UP;
		} 
		if (random < number) {
			return Result.DOWN;
		}
		return Result.SUCCESS;
	}
	
	public int getCount() {
		return this.count;
	}
}
