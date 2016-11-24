package ua.kas.third;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(1, 1, "p1");
		Point p2 = new Point(5, 1, "p2");
		Point p3 = new Point(5, 5, "p3");
		Point p4 = new Point(1, 5, "p4");
		Point p5 = new Point(3, 6, "p5");

		Figure figure1 = new Figure(p1, p2, p3);
		Figure figure2 = new Figure(p1, p2, p3, p4);
		Figure figure3 = new Figure(p1, p2, p3, p4, p5);
	}

}
