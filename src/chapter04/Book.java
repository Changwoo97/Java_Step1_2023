package chapter04;

public final class Book implements Cloneable {
	private String name;
	private String author;
	
	public Book() { }
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookinfo() {
		System.out.println("이름: " + name + ", 저자: " + author);
	}

	@Override
	public Book clone() throws CloneNotSupportedException {
		return new Book(name, author);
	}
}
