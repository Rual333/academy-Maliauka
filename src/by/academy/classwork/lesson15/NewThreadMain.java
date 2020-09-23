package by.academy.classwork.lesson15;

public class NewThreadMain {

	public static void main(String[] args) {
		NewThread temp = new NewThread();
		temp.start();
		NewRunnable temp1 = new NewRunnable();
		Thread temp2 = new Thread(temp1);
		temp2.start();
	}

}
