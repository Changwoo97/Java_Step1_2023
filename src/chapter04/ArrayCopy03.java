package chapter04;

public class ArrayCopy03 {
	public static void main(String[] args) {
		// 깊은 복사
		// Book클래스의 배열 만들기 3개
		Book[] books1 = new Book[3];
		Book[] books2 = new Book[3];
		
		// 초기화
		books1[0] = new Book("데미안", "헤르만 해세");
		books1[1] = new Book("빨간머리 앤", "몽고메리");
		books1[2] = new Book("백설공주", "그림형제");

		// bookArray2 객체 생성
		books2[0] = new Book();
		books2[1] = new Book();
		books2[2] = new Book();
		
		for (int i = 0; i < books2.length; i++) {
			books2[i].setName(books1[i].getName());
			books2[i].setAuthor(books1[i].getAuthor());
		}
		
		System.out.println("-------- 원본(bookArray1) --------");
		for (int i = 0; i < books2.length; i++) {
			Book book = books2[i];
			book.showBookinfo();
		}
	}
}
