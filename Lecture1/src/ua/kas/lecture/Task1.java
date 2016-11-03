package ua.kas.lecture;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("You have quadratic equation: ax^2+bx+c=0");

		System.out.println("Enter a: ");
		int a = scn.nextInt();
		System.out.println("Enter b: ");
		int b = scn.nextInt();
		System.out.println("Enter c: ");
		int c = scn.nextInt();
		scn.close();

		if (a != 0) {
			double discr = (Math.pow(b, 2) - 4 * a * c);
			System.out.println("D = b^2 - 4ac = " + discr);

			System.out.println((-b + (Math.sqrt(discr))));

			if (discr > 0) {
				System.out.println("2 root: ");
				System.out.println("x1 = " + (-b + (Math.sqrt(discr))) / (2 * a));
				System.out.println("x2 = " + (-b - (Math.sqrt(discr))) / (2 * a));
			} else if (discr == 0) {
				System.out.println("1 root: ");
				System.out.println("x = " + ((double) -b / 2 * a));
			} else if (discr < 0) {
				System.out.println("no root!");
			}
		} else {
			System.err.println("a = 0");
		}
	}
}