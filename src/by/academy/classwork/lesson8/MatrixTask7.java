package by.academy.classwork.lesson8;

import java.util.Random;

public class MatrixTask7<T extends Number> {

	private int kolStr;
	private int kolStol;
	private T[][] matr;
	private Random random = new Random();
	private T[][] newMatr;

	public MatrixTask7() {
		super();
	}

	public MatrixTask7(T[][] matr) {
		super();
		this.matr = matr;
		this.kolStr = matr.length;
		this.kolStol = matr[0].length;
	}

	@SuppressWarnings("unchecked")
	public MatrixTask7(int kolStr, int kolStol, T[][] t) {
		super();
		this.kolStr = kolStr;
		this.kolStol = kolStol;
		this.matr = t;
	}

	public int getKolStr() {
		return kolStr;
	}

	public void setKolStr(int kolStr) {
		this.kolStr = kolStr;
	}

	public int getKolStol() {
		return kolStol;
	}

	public void setKolStol(int kolStol) {
		this.kolStol = kolStol;
	}

	public T[][] getMatr() {
		return this.matr;
	}

	public void setMatr(T[][] matr) {
		this.matr = matr;
	}

	@SuppressWarnings("unchecked")
	public void addMatr(MatrixTask7<T> matr) {
		int minStr = Math.min(matr.getMatr().length, this.matr.length);
		int minStol = Math.min(matr.getMatr()[0].length, this.matr[0].length);
		for (int i = 0; i < minStr; i++) {
			for (int j = 0; j < minStol; j++) {
				this.matr[i][j] = (T) new Double(matr.getMatr()[i][j].doubleValue() + this.matr[i][j].doubleValue());
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void multByNum(double num) {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				this.matr[i][j] = (T) new Double(this.matr[i][j].doubleValue() * num);
			}
		}
	}

	public void printOnScreen() {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				System.out.printf("%.2f  ", this.matr[i][j].doubleValue());
			}
			System.out.println();
		}
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	public void multTwoMatrix(MatrixTask7<T> matr) {
		if (this.matr[0].length != matr.getMatr().length) {
			System.out.println("Multiplicate is impossible");
			return;
		}
		newMatr = (T[][]) new Object[this.matr.length][matr.getMatr()[0].length];
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < matr.getMatr()[0].length; j++) {
				for (int r = 0; r < matr.getMatr().length; r++) {
					newMatr[i][j] = (T) new Double((this.matr[i][r].doubleValue() * matr.getMatr()[r][j].doubleValue())
							+ newMatr[i][j].doubleValue());
				}
			}
		}
		this.kolStol = matr.getMatr()[0].length;
		;
		this.matr = newMatr;
	}

	@SuppressWarnings("unchecked")
	public void fullTheMatr() {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				matr[i][j] = (T) new Double(random.nextDouble());
			}
		}
	}
}
