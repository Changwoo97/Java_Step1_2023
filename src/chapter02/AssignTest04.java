package chapter02;

public class AssignTest04 {
	public static void main(String[] args) {
		System.out.println("=== 전위 연산 ===");
		int gameScore = 150;
		
		gameScore += 1;
		int lastScore1 = gameScore; 
		
		System.out.println(lastScore1);
		System.out.println("=========");
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		System.out.println("=== 후위 연산 ===");
		int lastScore3 = gameScore++;
		System.out.println(lastScore3);
		System.out.println(gameScore);
		
		
		int lastScore4 = gameScore;
		gameScore -= 1;
		
		
		System.out.println(lastScore4);
		System.out.println(gameScore);
	}
}
