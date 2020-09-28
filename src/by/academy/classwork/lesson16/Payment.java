package by.academy.classwork.lesson16;

public interface Payment {
	public boolean authorized(double amount);

	public boolean pay(double sum);
}
