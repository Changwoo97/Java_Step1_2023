package chapter04;

public class BookArray01 {
	public static void main(String[] args) {
		var books = new Book[5];
		
		for (var book : books) {
			System.out.println(book);
		}
	}
}
