package by.academy.classwork.details;

public class Engine {
	private String company;
	private int power;

	public Engine() {
		super();
	}

	public Engine(String company, int power) {
		super();
		this.company = company;
		this.power = power;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Company: " + this.company + ", power: " + this.power;
	}

}
