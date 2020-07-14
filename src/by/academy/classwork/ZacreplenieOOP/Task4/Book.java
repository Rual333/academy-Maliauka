package by.academy.classwork.ZacreplenieOOP.Task4;

public class Book {
	private String name;
	private String author;

	public Book() {
		super();
	}

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
