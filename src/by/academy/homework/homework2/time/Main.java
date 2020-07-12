package by.academy.homework.homework2.time;

public class Main {
	public static void main(String... strings) {
		Time t1 = new Time(-3666);
		Time t2 = new Time(1,75, 85);
		t1.getInfo();
		t2.getInfo();
		System.out.println(t1.getAllSeconds());
		System.out.println(t2.getAllSeconds());
		System.out.println(Time.compareTo(t1, t2));
		t1.addTime(3666);
		t2.addTime(0, 60, 60);
		t1.getInfo();
		t2.getInfo();
		t1.subtractTime(3600);
		t2.subtractTime(2, 2, 0);
		t1.getInfo();
		t2.getInfo();
	}
}
