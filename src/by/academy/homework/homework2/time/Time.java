package by.academy.homework.homework2.time;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int seconds) {
		this.seconds = seconds;
		normalize();
	}

	public Time(int hours, int minutes, int seconds) {
		this.seconds = hours * 3600 + minutes * 60 + seconds;
		normalize();
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return this.seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getAllSeconds() {
		return seconds + (minutes * 60) + (hours * 3600);
	}

	public static int compareTo(Time one, Time two) {
		return one.getAllSeconds() - two.getAllSeconds();
	}

	public void getInfo() {
		System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
	}

	public void addTime(int seconds) {
		this.seconds = getAllSeconds() + seconds;
		normalize();
	}

	public void addTime(int hours, int minutes, int seconds) {
		addTime(hours * 3600 + minutes * 60 + seconds);
	}

	public void subtractTime(int seconds) {
		this.seconds = getAllSeconds() - seconds;
		normalize();
	}

	public void subtractTime(int hours, int minutes, int seconds) {
		subtractTime(hours * 3600 + minutes * 60 + seconds);
	}

	private void normalize() {
		int s = this.seconds;
		this.hours = 0;
		this.minutes = 0;
		if (s >= 0) {
			if (seconds >= 60) {
				seconds %= 60;
				minutes = (s - seconds) / 60;
			}
			if (minutes >= 60) {
				hours = (minutes - minutes % 60) / 60;
				minutes = minutes % 60;
			}
		} else {
			if (seconds <= 60) {
				seconds %= 60;
				minutes = (s - seconds) / 60;
			}
			if (minutes <= 60) {
				hours = (minutes - minutes % 60) / 60;
				minutes = minutes % 60;
			}
		}
	}

}
