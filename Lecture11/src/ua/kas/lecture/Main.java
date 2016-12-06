package ua.kas.lecture;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		String[] names = { "Alex", "Sergey", "Jenya", "Slava", "Mark" };

		ArrayList<Pay> list = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				list.add(new Worker_1(i + 1, random.nextInt(10) + random.nextDouble(), names[random.nextInt(5)]));
			} else if (i % 2 == 1) {
				list.add(
						new Worker_2(i + 1, random.nextInt(200) + random.nextDouble() + 100, names[random.nextInt(5)]));
			}
		}

		Pay temp1;
		Pay temp2;

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size() - 1; j++) {
				if (list.get(i).getPay() < list.get(j).getPay()) {
					temp1 = list.get(i);
					temp2 = list.get(j);

					list.set(i, temp2);
					list.set(j, temp1);
				}
			}
		}

		Worker_1 temp_worker_1;
		Worker_2 temp_worker_2;

		for (Pay pay : list) {
			if (pay instanceof Worker_1) {
				temp_worker_1 = (Worker_1) pay;
				System.out.println("id = " + temp_worker_1.getId() + " name = " + temp_worker_1.getName() + " salary = "
						+ temp_worker_1.getPay());
			} else if (pay instanceof Worker_2) {
				temp_worker_2 = (Worker_2) pay;
				System.out.println("id = " + temp_worker_2.getId() + " name = " + temp_worker_2.getName() + " salary = "
						+ temp_worker_2.getPay());
			}
		}
	}

}
