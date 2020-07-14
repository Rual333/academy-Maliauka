package by.academy.classwork.ZacreplenieOOP.Task4;

public class Reader {

	private String fio;
	private int numOfBill;
	private String faculty;
	private String birthDay;
	private String phoneNumber;

	Reader() {
		super();
	}

	Reader(String fio, int numOfBill, String faculty) {
		super();
		this.fio = fio;
		this.numOfBill = numOfBill;
		this.faculty = faculty;
	}

	Reader(String fio, int numOfBill, String faculty, String birthDay, String phoneNumber) {
		super();
		this.fio = fio;
		this.numOfBill = numOfBill;
		this.faculty = faculty;
		this.birthDay = birthDay;
		this.phoneNumber = phoneNumber;

	}

	public String getFio() {
		return this.fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getNumOfBill() {
		return this.numOfBill;
	}

	public void setNumOfBill(int numOfBill) {
		this.numOfBill = numOfBill;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void takeBook(int kolBooks) {
		System.out.println(fio + " took " + kolBooks + " books ");
	}

	public void takeBook(String... nameOfBooks) {
		System.out.print(fio + " took books: ");
		for (String a : nameOfBooks) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	public void takeBook(Book... books) {
		System.out.print(fio + " took books: ");
		for (Book a : books) {
			System.out.print(a.getAuthor() + " \"" + a.getName() + "\", ");
		}
		System.out.println();
	}

	public void returnBook(int kolBooks) {
		System.out.println(fio + " return " + kolBooks + " books");
	}

	public void returnBook(String... nameOfBooks) {
		System.out.print(fio + " return books: ");
		for (String a : nameOfBooks) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

	public void returnBook(Book... books) {
		System.out.print(fio + " return books: ");
		for (Book a : books) {
			System.out.print(a.getAuthor() + " \"" + a.getName() + "\", ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "FIO: " + fio + ", num of bill: " + numOfBill + ", faculty: " + faculty + ", birthday: " + birthDay
				+ ", phone number: " + phoneNumber;
	}

}
