package ua.kas.third;

public class Point {

	private int x;
	private int y;

	private String name;

	public Point(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getName() {
		return name;
	}

}
