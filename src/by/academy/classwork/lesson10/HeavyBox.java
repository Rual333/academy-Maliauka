package by.academy.classwork.lesson10;

public class HeavyBox extends Box implements Comparable<HeavyBox> {

	private int weight;

	public HeavyBox() {
		super();
	}

	public HeavyBox(int w, int h, int d, int m) {
		super();
		width = w;
		height = h;
		depth = d;
		weight = m;

	}

	public int getWeigth() {
		return weight;
	}

	public void setWeight(int w) {
		weight = w;
	}

	@Override
	public int compareTo(HeavyBox o) {
		if (o.getWeigth() > weight) {
			return -1;
		} else if (o.getWeigth() > weight) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=").append(weight).append("]");
		return builder.toString();
	}

}
