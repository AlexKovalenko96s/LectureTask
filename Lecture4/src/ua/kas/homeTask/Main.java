package ua.kas.homeTask;

import java.util.Random;

public class Main {

	static Random random = new Random();

	public static void main(String[] args) {
		// first();
		// second();
		// third();
		// fourth();
		fifth();
		// sixth();
		// seventh();
		// eight();
		// ninth();
	}

	public static void first() {
		System.out.println("-----1-----");

		int[] m = new int[35];

		int sum = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(12000);
			sum += m[i];
		}

		if (sum / 100000 > 1) {
			System.out.println("Yes, " + sum);
		} else {
			System.out.println("Fail!");
		}
	}

	public static void second() {
		System.out.println("-----2-----");

		int[] m = new int[10];

		int sum = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(11);
			sum += m[i];
		}

		if (sum >= 50) {
			System.out.println("Next!");
		} else {
			System.out.println("Fail!");
		}
	}

	public static void third() {
		System.out.println("-----3-----");

		int[] m = new int[18];

		int sumOff = 0;
		int sumShort = 0;
		int sumDop = 0;
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(12000);
			if (i < 6) {
				sumOff += m[i];
			} else if (i >= 6 && i < 12) {
				sumShort += m[i];
			} else {
				sumDop += m[i];
			}
		}

		max = (sumOff > sumShort) ? sumOff : sumShort;
		max = (max > sumDop) ? max : sumDop;

		System.out.println("off = " + sumOff + " short = " + sumShort + " dop = " + sumDop + " max = " + max);
	}

	public static void fourth() {
		System.out.println("-----4-----");

		int[] m = new int[30];

		int count = 0;
		int maxCount = 0;

		boolean flag = false;

		for (int i = 0; i < m.length; i++) {
			m[i] = (random.nextInt(11) - 5);
			if (m[i] >= 0) {
				if (flag) {
					count++;
				} else {
					flag = true;
					count = 0;
					count++;
				}
			} else {
				flag = false;
				maxCount = (maxCount > count) ? maxCount : count;
			}
			System.out.println(m[i]);
		}
		System.out.println("maxCount = " + maxCount);
	}

	public static void fifth() {
		System.out.println("-----5-----");

		int[] m = { 2, 4, 6, 23, 5, 22, 12, 9, 41, 10, 11 };

		int count = 0;
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			max = (m[i] > max) ? m[i] : max;
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 1; j <= max; j++) {
				if (((double) m[i] / j) % 1 == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(m[i]);
			}
			count = 0;
		}
	}

	public static void sixth() {
		System.out.println("-----6-----");

		int[] m = { 2, 4, 6, 23, 5, 22, 12, 9, 7, 10, 11 };

		int max = 0;
		int min = 0;

		for (int i = 0; i < m.length; i++) {
			if (i == 0) {
				min = m[i];
			}
			max = (max > m[i]) ? max : m[i];
			min = (min < m[i]) ? min : m[i];
		}

		System.out.println("min = " + min + " max = " + max);
	}

	public static void seventh() {
		System.out.println("-----7-----");

		int[] m = new int[30];

		int count = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(10);
			System.out.println(m[i]);
		}

		System.out.println("--------");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[j] == m[i]) {
					count++;
					if (count >= 2) {
						m[j] = 0;

					}
				}

			}
			count = 0;
		}

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
	}

	public static void eight() {
		System.out.println("-----8-----");

		int[] m = new int[30];

		int number = 3;

		for (int i = 0; i < m.length; i++) {
			m[i] = (random.nextInt(11) - 5);
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i] < 0) {
				m[i] = 0;
			}
			if (m[i] > number) {
				m[i] = 0;
			}
			if (i > 20 && i < 25) {
				m[i] = 0;
			}
			System.out.println(m[i]);
		}
	}

	public static void ninth() {
		System.out.println("-----4-----");

		int[] m = new int[30];

		for (int i = 0; i < m.length; i++) {
			m[i] = (random.nextInt(11));

			if (i % 2 != 0 && m[i] % 2 == 0) {
				m[i] = 0;
			}
			if (m[i] % 3 == 0 || m[i] % 5 == 0) {
				m[i] = 0;
			}
			System.out.println(m[i]);
		}
	}

}