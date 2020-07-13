package by.academy.classwork.ZacreplenieOOP.Task3;

import java.util.Random;

public class Matrix {

	private int kolStr;
	private int kolStol;
	private double[][] matr;
	private Random random = new Random();
	private double[][] newMatr;

	public Matrix() {
		super();
	}

	public Matrix(int kolStr, int kolStol) {
		super();
		this.kolStr = kolStr;
		this.kolStol = kolStol;
		this.matr = new double[kolStr][kolStol];
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
	
	public double[][] getMatr() {
		return this.matr;
	}

	public void addMatr(Matrix matr) {
		int minStr = Math.min(matr.getMatr().length, this.matr.length);
		int minStol = Math.min(matr.getMatr()[0].length, this.matr[0].length);
		for (int i = 0; i < minStr; i++) {
			for (int j = 0; j < minStol; j++) {
				this.matr[i][j] += matr.getMatr()[i][j];
			}
		}
	}

	public void multByNum(double num) {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				this.matr[i][j] *= num;
			}
		}
	}

	public void printOnScreen() {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				System.out.printf("%.2f  ", this.matr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public void multTwoMatrix(Matrix matr) {
		if (this.matr[0].length != matr.getMatr().length) {
			System.out.println("Multiplicate is impossible");
			return;
		}
		newMatr = new double[this.matr.length][matr.getMatr()[0].length];
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < matr.getMatr()[0].length; j++) {
				for (int r = 0; r < matr.getMatr().length; r++) {
					newMatr[i][j] += this.matr[i][r] * matr.getMatr()[r][j];
				}
			}
		}
		this.kolStol = matr.getMatr()[0].length;;
		this.matr = newMatr;
	}
	
	public void fullTheMatr() {
		for (int i = 0; i < kolStr; i++) {
			for (int j = 0; j < kolStol; j++) {
				matr[i][j] = random.nextDouble()*10;
			}
		}
	}
}
