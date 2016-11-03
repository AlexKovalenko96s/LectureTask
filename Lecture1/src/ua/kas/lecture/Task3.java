package ua.kas.lecture;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter P of square: ");
		int p = scn.nextInt();
		scn.close();

		System.out.println("a = b = " + ((double) p / 2));
	}
}