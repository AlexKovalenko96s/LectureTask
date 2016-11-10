package ua.kas.lecture;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		first();
		second();
		third();
		fourth();
		fifth();
	}

	public static void first() {
		System.out.println("-----1-----");
		for (int i = 1; i < 10; i++) {
			if (i == 8)
				continue;
			for (int j = 9; j <= 81; j += 9) {
				System.out.println(i * j);
			}
		}
	}

	public static void second() {
		System.out.println("-----2-----");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 7 = " + i * 7);
		}
	}

	public static void third() {
		System.out.println("-----3-----");
		for (int i = 2; i <= 20; i++) {
			System.out.println(Math.sin(i));
		}
	}

	public static void fourth() {
		System.out.println("-----4-----");
		double x = 3;
		double f = 1;
		double result = x;
		int znak = 1;
		for (int i = 3; i <= 13; i += 2) {
			znak *= -1;

			for (int j = 1; j <= i; j++) {
				f *= j;
			}

			result = result + znak * (Math.pow(x, i) / f);
			f = 1;

			System.out.println(result);
			System.out.println("----");
		}
		System.out.println("Result: " + result);
	}

	public static void fifth() {
		System.out.println("-----5-----");
		System.out.println("enter a,b,h: ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int h = scn.nextInt();
		scn.close();

		for (int i = a; i <= b; i += h) {
			System.out.println("x = " + i + " | " + Math.tan(i));
			System.out.println("x = " + i + " | " + (1 / Math.tan(i) + 1));
		}
	}
}