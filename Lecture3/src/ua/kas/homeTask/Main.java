package ua.kas.homeTask;

import java.util.Scanner;

public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// first();
		// second();
		// third();
		// sixth();
		// seventh();
		// eighth();
		// ninth();
		// tenth();
		eleventh();

		scn.close();
	}

	public static void first() {
		System.out.println("-----1-----");

		System.out.println("Enter h, a, b: ");
		int h = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();

		for (int i = a; i <= b; i += h) {
			System.out.println("x = " + i + "   " + (i - Math.sin(i)));
			System.out.println("x = " + i + "   " + (Math.pow(Math.sin(i), 2)));
			System.out.println("x = " + i + "   " + (2 * Math.cos(i) - 1));
			System.out.println("-----");
		}
	}

	public static void second() {
		System.out.println("-----2-----");

		for (double i = 1; i <= 5; i += 0.5) {
			System.out.println("y = ax^2 + b = " + (3 * Math.pow(i, 2) + (-5)) + " if x = " + i);
		}
	}

	public static void third() {
		System.out.println("-----3-----");

		System.out.println("Enter number: ");
		int number = scn.nextInt();
		System.out.println("and enter a & b: ");
		int a = scn.nextInt();
		int b = scn.nextInt();

		int countA = 0;
		int countB = 0;

		for (int i = 0; i <= number; i++) {
			int first = i / 100;
			int second = (i % 100) / 10;
			int third = i % 10;

			if (a == first) {
				countA++;
			}
			if (a == second) {
				countA++;
			}
			if (a == third) {
				countA++;
			}

			if (b == first) {
				countB++;
			}
			if (b == second) {
				countB++;
			}
			if (b == third) {
				countB++;
			}

			System.out.println(countA + " " + countB + " " + i);
		}

		if (countA > countB) {
			System.out.println("countA > countB");
		}
		if (countA == countB) {
			System.out.println("countA = countB");
		}
		if (countA < countB) {
			System.out.println("countA = countB");
		}
	}

	public static void sixth() {
		System.out.println("-----6-----");
		double k;

		for (int x = 0; x <= 30; x++) {
			for (int y = 0; y <= 30; y++) {

				k = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
				if (k <= 30 && (k % 1) == 0) {
					System.out.println(k);
				}
			}
		}
	}

	public static void seventh() {
		System.out.println("-----7-----");

		int count = 0;

		for (int i = 100;; i++) {
			if (count > 15) {
				return;
			} else if ((i % 19) == 0) {
				count++;
				System.out.println(i);
			}
		}
	}

	public static void eighth() {
		System.out.println("-----8-----");

		int count = 0;

		for (int i = 0; i <= 500; i++) {
			if (count > 20) {
				return;
			} else if (((i % 13) == 0 || (i % 17) == 0) && i != 0) {
				count++;
				System.out.println(i);
			}
		}
	}

	public static void ninth() {
		System.out.println("-----9-----");

		System.out.println("Enter Z: ");
		int z = scn.nextInt();
		int sum = 0;
		int count = 0;

		for (int i = 2;; i += 2) {
			count++;
			sum += i;
			if (sum + i + 2 >= z) {
				System.out.println("count = " + count + " sum = " + sum + " last = " + i);
				break;
			}
		}
	}

	public static void tenth() {
		System.out.println("-----10-----");

		int sum = 0;
		int count = 0;

		for (int i = 1;; i += 4) {
			count++;
			sum += i;
			System.out.println(i);
			if (count >= 10) {
				System.out.println("sum = " + sum);
				break;
			}
		}
	}

	public static void eleventh() {
		System.out.println("-----11-----");

		// for (int i = 0; i < 10; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print("$");
		// }
		// System.out.println();
		// }
		//
		// System.out.println("-----");
		//
		// for (int i = 0; i < 10; i++) {
		// for (int j = i; j < 10; j++) {
		// System.out.print("$");
		// }
		// System.out.println();
		// }
		//
		// System.out.println("-----");

		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {

			}
			System.out.println();
		}
	}
}