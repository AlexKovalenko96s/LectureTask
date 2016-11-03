package ua.kas.lecture;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a: ");
		double a = scn.nextInt();
		System.out.println("Enter b: ");
		double b = scn.nextInt();
		System.out.println("Enter c: ");
		double c = scn.nextInt();
		System.out.println("Enter d: ");
		double d = scn.nextInt();
		System.out.println("Enter x: ");
		double x = scn.nextInt();
		System.out.println("Enter y: ");
		double y = scn.nextInt();
		scn.close();

		// first
		System.out.println(
				(b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a) - (Math.pow(a, 3) * c) + (Math.pow(b, -2)));

		// second
		System.out.println((a / c) * (b / d) - ((a * b - c) / (c * d)));

		// third
		System.out.println(x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5));

		// fourth
		System.out.println(((x + y) / (y + 1)) - ((x * y - 12) / (34 + x)));

		// fifth
		System.out.println((Math.sin(Math.sqrt(x + 1))) - (Math.sin(Math.sqrt(x - 1))));
	}
}