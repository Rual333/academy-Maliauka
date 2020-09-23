package by.academy.classwork.lesson15;

public class ChangeInThread extends Thread {

	StringBuilder sb;

	ChangeInThread(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 100; i++) {
				System.out.println(sb.toString() + i);
				sb.append('a');
			}
		}
	}
}
