package ua.kas.lecture;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// first();
		// second();
		// third();
		// fourth();
		// fifth();
		// sixth();
		// seventh();
	}

	public static void first() {
		System.out.println("-----1-----");

		double[] kurs = { 21.8, 22, 21.7, 21.9 };
		int lenght = kurs.length;
		Arrays.sort(kurs);
		System.out.println(kurs[lenght - 1]);
	}

	public static void second() {
		System.out.println("-----2-----");

		Random random = new Random();

		int[] m = new int[30];

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100);
		}

		double number = 0;

		for (int i = 0; i < m.length; i++) {
			number = Math.sqrt(i);

		}
	}

	public static void third() {
		System.out.println("-----3-----");

		Random random = new Random();

		int[] m = new int[30];

		int sum = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100);
		}

		for (int i = 0; i < m.length; i++) {
			if (i % 2 == 0) {
				sum += m[i];
			}
		}

		System.out.println(sum);
	}

	public static void fourth() {
		System.out.println("-----4-----");

		Random random = new Random();

		int[] m = new int[30];

		int mult = 1;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100);
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i] % 9 == 0) {
				mult *= m[i];
			}
		}

		System.out.println(mult);
	}

	public static void fifth() {
		System.out.println("-----5-----");

		Random random = new Random();

		int[] m = new int[30];

		double lenght = 5;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(2);
			// 0 - пасмурный
			// 1 - солнечный
		}

		for (int i = 0; i < m.length; i++) {
			if (m[i] == 0) {
				lenght -= 0.01;
			} else if (m[i] == 1) {
				lenght += 0.02;
			}
		}

		System.out.println(lenght);
	}

	public static void sixth() {
		System.out.println("-----6-----");

		Random random = new Random();

		int count = 3;
		int mounth1 = 0;
		int mounth2 = 0;
		int mounth3 = 0;
		int sum = 0;

		int[] r = new int[30 * count];
		int[] p = new int[30 * count];
		int[] z = new int[30 * count];

		for (int i = 0; i < r.length; i++) {
			r[i] = random.nextInt(100);
		}
		for (int i = 0; i < p.length; i++) {
			p[i] = random.nextInt(100);
		}

		for (int i = 0; i < z.length; i++) {
			z[i] = r[i] - p[i];

			if (i < 30) {
				mounth1 += z[i];
			} else if (i >= 30 && i < 60) {
				mounth2 += z[i];
			} else if (i >= 60 && i < 90) {
				mounth3 += z[i];
			}
		}
		sum = mounth1 + mounth2 + mounth3;
		System.out.println("1 = " + mounth1 + " 2 = " + mounth2 + " 3 = " + mounth3 + " sum = " + sum);
	}

	public static void seventh() {
		System.out.println("-----7-----");

		Random random = new Random();

		int[] h = new int[30];
		int[] d = new int[30];

		for (int i = 0; i < h.length; i++) {
			h[i] = random.nextInt(20);
			d[i] = random.nextInt(20);
		}

		Arrays.sort(h);
		Arrays.sort(d);

		System.out.println("1h = " + h[h.length - 1] + " 2h = " + h[h.length - 2] + " 3h = " + h[h.length - 3]);
		System.out.println("1d = " + d[d.length - 1] + " 2d = " + d[d.length - 2] + " 3d = " + d[d.length - 3]);

		System.out.println("lose h = " + h[0] + " lose h = " + h[1] + " lose h = " + h[2]);
		System.out.println("lose d = " + d[0] + " lose d = " + d[1] + " lose d = " + d[2]);

	}

	public static void eight() {
		System.out.println("-----8-----");

		Random random = new Random();

		int[] m = new int[20];
		int change1 = 0;
		int change2 = 0;

		for (int i = 0; i < m.length; i++) {
			m[i] = random.nextInt(100);
			System.out.println(m[i]);
		}

		for (int i = 0; i < m.length / 2; i++) {
			change1 = m[i];
		}
	}
}