package ua.kas.lecture;

public class Cat {

	String color;
	int age;

	public Cat(String color, int age) {
		this.age = age;
		this.color = color;
	}

	int a = 5, b = 7, max = 0;

	public void oooo() {
		max = (a > b) ? a : b;
	}
}
