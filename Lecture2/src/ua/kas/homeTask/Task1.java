package ua.kas.homeTask;

import java.util.Scanner;

public class Task1 {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// task1();
		// task2();
		// task3();
		// task4();
		// task5();
		// task6();
		// task7();
		// task8();
		// task9();
		task10();
	}

	public static void task1() {
		System.out.println("-----1-----");
		System.out.println("Please enter 'a' & 'b': ");

		double a = scn.nextDouble();
		double b = scn.nextDouble();

		if (b != 0) {
			System.out.println("Result = " + (a / b));
		} else {
			System.out.println("Not correct 'b'" + "\n" + "Try again!");
			task1();
		}
	}

	public static void task2() {
		System.out.println("-----2-----");
		System.out.println("Please enter year when port was founded in Odessa: ");

		if (scn.nextInt() == 1794) {
			System.out.println("Yeah");
		} else {
			System.out.println("You`re wrong. Port was founded in Odessa on 1794.");
		}
	}

	public static void task3() {
		System.out.println("-----3-----");
		System.err.println("The third made in the class.");
	}

	public static void task4() {
		System.out.println("-----4-----");
		System.out.println("Please enter the number: ");

		if (scn.nextInt() % 2 == 0) {
			System.out.println("Your number is an even.");
		} else {
			System.out.println("Your nubmer is an odd.");
		}
	}

	public static void task5() {
		System.out.println("-----6-----");
		System.out.println("Enter number : ");

		if (scn.nextInt() % 3 == 0) {
			System.out.println("Enter number divisible by 3");
		} else {
			System.out.println("Enter number NOT divisible by 3");
		}
	}

	public static void task6() {
		System.out.println("-----6-----");

		int cost = 5;

		System.out.println("Enter ninutes: ");
		double minutes = scn.nextDouble();
		System.out.println("Enter weekday (6,7 - 20% sale) : ");
		int day = scn.nextInt();

		if (day == 6 || day == 7) {
			System.out.println("Call cost = " + ((minutes * cost) - ((minutes * cost) * 0.2)));
		} else if (day > 0 && day < 6) {
			System.out.println("Call cost = " + (minutes * cost));
		} else {
			System.out.println("Not correct day'" + "\n" + "Try again!");
			task6();
		}
	}

	public static void task7() {
		System.out.println("-----7-----");

		System.out.println("Please enter number (example 123): ");
		int number = scn.nextInt();

		int first = number / 100;
		int second = (number % 100) / 10;
		int third = number % 10;

		if (first > third) {
			System.out.println("first > third");
		} else if (first < third) {
			System.out.println("first < third");
		} else {
			System.out.println("first = third");
		}

		if (first > second) {
			System.out.println("first > second");
		} else if (first < second) {
			System.out.println("first < second");
		} else {
			System.out.println("first = second");
		}

		if (second > third) {
			System.out.println("second > third");
		} else if (second < third) {
			System.out.println("second < third");
		} else {
			System.out.println("second = third");
		}
	}

	public static void task8() {
		System.out.println("-----8-----");

		System.out.println("Please enter number (example 123): ");
		int number = scn.nextInt();

		int first = number / 100;
		int second = (number % 100) / 10;
		int third = number % 10;

		if (Math.pow(number, 2) == Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3)) {
			System.out.println("Equals.");
		} else {
			System.out.println("Not equals.");
		}
	}

	public static void task9() {
		System.out.println("-----9-----");

		System.out.println("Please enter 'a' & 'b': ");

		double a = scn.nextDouble();
		double b = scn.nextDouble();

		double min = 0;
		double max = 0;

		if (a != b) {
			max = (a > b) ? a : b;
			min = (a < b) ? a : b;

			min = (min + max) / 2;
			max = (min * max) * 2;
			System.out.println("min = " + min + ", and max = " + max);

			// OR

			// if (a > b) {
			// System.out.println("a = " + ((a * b) * 2) + " b = " + ((a + b) /
			// 2));
			// } else if (a < b) {
			// System.out.println("a = " + ((a + b) / 2) + " b = " + ((a * b) *
			// 2));
			// }

		} else {
			System.out.println("Not correct 'b'" + "\n" + "Try again!");
			task9();
		}
	}

	public static void task10() {
		System.out.println("-----10-----");

		System.out.println("Please enter 'a' & 'b': ");

		double a = scn.nextDouble();
		double b = scn.nextDouble();

		double discr = (Math.pow(b, 2) - 4 * a);
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
	}
}