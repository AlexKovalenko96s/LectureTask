package ua.kas.list;

public class MyArrayList implements MyCollection {

	private int[] array;

	private final int MIN_VALUE = 10;
	private final int ERROR_LOG = -12345;

	private int indexator;

	public MyArrayList() {
		array = new int[MIN_VALUE];
		indexator = 0;
	}

	@Override
	public void add(int element) {
		if (indexator < array.length) {
			array[indexator] = element;
			++indexator;
		} else {
			int[] temp_array = new int[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				temp_array[i] = array[i];
			}
			temp_array[indexator] = element;
			++indexator;
			array = temp_array;
		}
	}

	@Override
	public void add(int index, int element) {
		if (index < array.length) {
			array[index] = element;
			if (index >= indexator) {
				indexator = index + 1;
			}
		} else {
			int size = 10;
			while (index < size) {
				size *= 2;
			}

			int[] temp_array = new int[size];
			for (int i = 0; i < array.length; i++) {
				temp_array[i] = array[i];
			}

			temp_array[index] = element;
			array = temp_array;
			indexator = array.length; //////
		}

	}

	@Override
	public boolean remove(int index) {
		if (index >= indexator - 1)
			return false;

		for (int i = index; i < indexator - 1; i++) {
			array[i] = array[i + 1];
		}

		--indexator;

		if ((indexator - 1) <= array.length / 2) {
			int[] temp_array = new int[array.length / 2];
			for (int i = 0; i < array.length; i++) {
				temp_array[i] = array[i];
			}
			array = temp_array;
		}
		return true;
	}

	@Override
	public void clear() {
		indexator = 0;
		array = new int[MIN_VALUE];
	}

	@Override
	public int size() {
		return indexator - 1;
	}

	@Override
	public boolean contains(int element) {
		for (int i = 0; i <= indexator - 1; i++) {
			if (array[i] == element)
				return true;
		}
		return false;
	}

	@Override
	public int[] toArray() {
		if (indexator == 0)
			return new int[0];
		int temp_array[] = new int[indexator - 1];
		for (int i = 0; i < indexator - 1; i++) {
			temp_array[i] = array[i];
		}
		return temp_array;
	}

	@Override
	public int get(int index) {
		if (index < indexator)
			return array[index];
		return ERROR_LOG;
	}

	@Override
	public int indexOf(int element) {
		for (int i = 0; i <= indexator - 1; i++) {
			if (array[i] == element)
				return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(int element) {
		for (int i = indexator - 1; i >= 0; i--) {
			if (array[i] == element)
				return i;
		}
		return -1;
	}

	@Override
	public String toString() {
		String str = "{";
		for (int i = 0; i < indexator - 1; i++) {
			str += array[i] + ",";
		}

		str += array[indexator - 1] + "}";
		return str;
	}

	@Override
	public boolean equals(Object obj) {
		MyArrayList list = (MyArrayList) obj;
		if (list.size() != this.size())
			return false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != this.get(i))
				return false;
		}

		return true;
	}

}
