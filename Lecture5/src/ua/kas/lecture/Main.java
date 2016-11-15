package ua.kas.lecture;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// first();
		// second();
		// third();
		// fourth();
		// fifth();
	}

	public static void first() {
		System.out.println("-----1-----");

		int[][] m = { { 3, 7, 12 }, { 2, 1, 6 }, { 11, 8, 4 } };

		int min = 1;
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				min = (m[i][j] > min) ? min : m[i][j];
				max = (m[i][j] > max) ? m[i][j] : max;
			}
		}
		System.out.println("min = " + min + " max = " + max);
	}

	public static void second() {
		System.out.println("-----2-----");

		Random random = new Random();

		int[][] m = new int[15][15];

		int sum = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = random.nextInt(11);
				if (i == j) {
					sum += m[i][j];
				}
			}
		}
		System.out.println("sum = " + sum);
	}

	public static void third() {
		System.out.println("-----3-----");

		int[][] m = { { 3, 7, 12 }, { 2, 1, 6 }, { 11, 8, 4 } };

		int min = 1;
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				min = (m[i][j] > min) ? min : m[i][j];
				max = (m[i][j] > max) ? m[i][j] : max;
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == min) {
					System.out.println(" min i = " + i + " min j = " + j);
				} else if (m[i][j] == max) {
					System.out.println(" max i = " + i + " max j = " + j);
				}
			}
		}
	}

	public static void fourth() {
		System.out.println("-----4-----");

		int[][] m = { { 3, 7, 12 }, { 2, 1, 6 }, { 11, 8, 4 } };

		int min = 30;
		int max = 0;
		int col = 0;
		int row = 0;
		int indexMin = 0;
		int indexMax = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				row += m[i][j];
			}

			if (row < min) {
				min = row;
				indexMin = i;
			} else if (row > max) {
				max = row;
				indexMax = i;
			}

			row = 0;
		}

		System.out.println(
				"max row = " + max + " indexMax = " + indexMax + " min row = " + min + " indexMin = " + indexMin);

		min = 30;
		max = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				col += m[j][i];
			}

			if (col < min) {
				min = col;
				indexMin = i;
			} else if (col > max) {
				max = col;
				indexMax = i;
			}

			col = 0;
		}

		System.out.println(
				"max col = " + max + " min row = " + indexMax + " min col = " + min + " indexMin = " + indexMin);
	}

	public static void fifth() {
		System.out.println("-----5-----");

		Random random = new Random();

		int[][] m = new int[15][15];

		int min = 11;
		int max = 0;
		int countMin = 0;
		int countMax = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = random.nextInt(11);
				min = (m[i][j] > min) ? min : m[i][j];
				max = (m[i][j] > max) ? m[i][j] : max;
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == max) {
					countMax++;
				}
				if (m[i][j] == min) {
					countMin++;
				}
			}
		}

		System.out.println("max = " + max + " countMax = " + countMax + " min = " + min + " countMin = " + countMin);
	}

}