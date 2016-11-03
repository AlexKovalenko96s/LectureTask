package ua.kas.lecture;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = scn.nextInt();
		System.out.println("Enter b: ");
		int b = scn.nextInt();
		scn.close();

		System.out.println("P = a + b = " + (a + b));
		System.out.println("S = a * b = " + (a * b));
	}
}