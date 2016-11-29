package ua.kas.list;

interface MyCollection {

	void add(int element);

	void add(int index, int element);

	boolean remove(int index);

	void clear();

	int size();

	boolean contains(int element);

	int[] toArray();

	int get(int index);

	int indexOf(int element);

	int lastIndexOf(int element);

}
