package chapter06;

public class BaseballGameMain {
	public static void main(String[] args) {
		var game = new BaseballGame();
		var str = "";
		
		do {
			str = game.check();
			System.out.println(str);
			System.out.println();
		} while (str != "WIN");
	}
}
