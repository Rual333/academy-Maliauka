package by.academy.classwork.ZacreplenieOOP.Task8;

public class Main {
	public static void main(String... strings) {
		
		Animal[] zoo = { new Dog("HotDoggy", "sausages", "Berlin", "german shepherd", 4),
				new Cat("Vaska", "Chicken of Tabak", "East Europe", 37, "Black", "Wool is everywhere"),
				new Horse("Flash", "elite hay", "Frieslan", "Friesian", "black", true) };
		
		Veterinary aiBolit = new Veterinary();
		

			aiBolit.treatAnimal(zoo);

	}
}
