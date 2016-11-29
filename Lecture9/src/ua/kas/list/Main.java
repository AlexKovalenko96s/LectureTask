package ua.kas.list;

public class Main {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();

		for (int i = 0; i < 12; i++) {
			list.add(i * 10);
			System.out.println(list.get(i));
		}

		// if (list.indexOf(30) != -1)
		// list.remove(list.indexOf(30));

		int[] m = list.toArray();

		for (int i = 0; i < m.length; i++)
			System.out.println(m[i]);

	}

}
