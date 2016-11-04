package ua.kas.lecture;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter: ");
		double sum = scn.nextDouble();
		scn.close();

		System.out.println("start = " + sum);
		System.out.println("First: ");

		if (sum > 1000) {
			System.out.println(sum - ((sum / 100) * 10));
		} else {
			System.out.println(sum);
		}

		System.out.println("Second: ");

		if (sum > 500 && sum < 1000) {
			System.out.println(sum - ((sum / 100) * 3));
		} else if (sum > 1000) {
			System.out.println(sum - ((sum / 100) * 5));
		} else {
			System.out.println(sum);
		}
	}
}