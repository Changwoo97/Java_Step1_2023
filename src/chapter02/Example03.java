package chapter02;

public class Example03 {
	public static void main(String[] args) {
		int score1 = 70;
		String str = (score1 >= 60) ? "합격" : "불합격";
		System.out.println("score1 : " + score1);
		System.out.println(str);
		System.out.println();
		
		score1 = 50;
		str = (score1 >= 60) ? "합격" : "불합격";
		System.out.println("score1 : " + score1);
		System.out.println(str);
		System.out.println();
		
		System.out.println("--------------------");
		
		int score2 = 100;
		char ch = (score2 > 90) ? 'A' 
				: ((score2 > 80 ? 'B' : 'C'));
		System.out.println("score2 : " + score2);
		System.out.println(ch);
		System.out.println();
		
		score2 = 90;
		ch = (score2 > 90) ? 'A' 
				: ((score2 > 80 ? 'B' : 'C'));
		System.out.println("score2 : " + score2);
		System.out.println(ch);
		System.out.println();
		
		score2 = 80;
		ch = (score2 > 90) ? 'A' 
				: ((score2 > 80 ? 'B' : 'C'));
		System.out.println("score2 : " + score2);
		System.out.println(ch);
		System.out.println();
	}
}
