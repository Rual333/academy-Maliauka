package by.academy.classwork.ZacreplenieOOP.Task4;

public class Main {
	public static void main(String[] aregs) {
		
		Book[] books = {new Book("Tiger! Tiger!","Alfred Bester"), new Book("The same things", "My imaginary"), new Book("The journey of nils", "Andersen")};
		Reader[] readers = new Reader[10];
		
		for (int i = 0; i < 10; i++) {
			readers[i] = new Reader("No name", i, "No face", "19.09.1999", "No number");
			System.out.println(readers[0].toString());
		}
		
		System.out.println(readers[0].toString());
		
		readers[0].takeBook(books);
		readers[0].returnBook(books);
	
		readers[0].takeBook("Alesya", "Kolchin" , "Palesse");
		readers[0].returnBook("Alesya", "Kolchin" , "Palesse");
		
		readers[0].takeBook(15);
		readers[0].returnBook(15);
		
		readers[0].toString();
	}
}
