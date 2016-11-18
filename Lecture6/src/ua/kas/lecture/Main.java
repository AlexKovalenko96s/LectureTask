package ua.kas.lecture;

public class Main {

	static NotMain notMain = new NotMain();

	public static int a = 5;
	public static int b = 7;

	public static void main(String[] args) {
		System.out.println(notMain.plus(a, b));
		System.out.println(notMain.minus(a, b));
		System.out.println(notMain.mult(a, b));
		System.out.println(notMain.delimeter(a, b));
		System.out.println(notMain.pow(a, b));
		// Cat cat = new Cat("Red", 13);
	}
}
