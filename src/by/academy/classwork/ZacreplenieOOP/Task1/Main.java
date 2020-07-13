package by.academy.classwork.ZacreplenieOOP.Task1;

public class Main {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone("+375 29 1112111", "LX-12");
		Phone p3 = new Phone("+375 33 6669666", "S-style", 37);
		
		p1.setModel("Chrome");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		p1.receiveCall("John Travobla");
		p2.receiveCall("Mom");
		p3.receiveCall("\"Is anybode home?\"");
		
		System.out.println(p1.getNumber());
		System.out.println(p2.getNumber());
		System.out.println(p3.getNumber());

		p1.receiveCall("No Soul", "+375 44 0000000");
		
		p2.sendMessage("+329 75 3930043","+856 37 8857394","+759 37 5493845","+953 84 8752038");
	}
}
