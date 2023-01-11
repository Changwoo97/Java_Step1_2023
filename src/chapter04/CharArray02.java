package chapter04;

public class CharArray02 {
	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for (int i = 0; i < alphabets.length; i++) {
			char alphabet = alphabets[i];
			System.out.printf("%c(%d) ", alphabet, (int)alphabet);
		}
		System.out.println();
	}
}
