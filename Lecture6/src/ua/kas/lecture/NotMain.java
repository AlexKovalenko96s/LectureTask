package ua.kas.lecture;

public class NotMain {

	public int plus(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public double delimeter(int a, int b) {
		return a / b;
	}

	public int pow(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	public double plus(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		return a - b;
	}

	public double mult(double a, double b) {
		return a * b;
	}

	public double delimeter(double a, double b) {
		return a / b;
	}

	public double pow(double a, double b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
}
