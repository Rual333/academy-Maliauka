package by.academy.classwork.lesson10;

public class Toy {
	double softness = 0;

	Toy() {
		super();
	}

	Toy(double soft) {
		super();
		softness = soft;
	}

	public void setSoftness(double soft) {
		softness = soft;
	}

	public double getSoftness() {
		return softness;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("softness = ").append(softness);
		return builder.toString();
	}
}
