package ua.kas.third;

public class Figure {

	private String name;
	private String type;

	private double result;
	private double x;
	private double y;

	public Figure(Point point1, Point point2, Point point3) {
		name = point1.getName() + point2.getName() + point3.getName();
		type = "triangle";
		result = lengthSide(point1, point2) + lengthSide(point2, point3) + lengthSide(point3, point1);

		System.out.println(name);
		System.out.println(type);
		System.out.println(result);
	}

	public Figure(Point point1, Point point2, Point point3, Point point4) {
		name = point1.getName() + point2.getName() + point3.getName() + point4.getName();
		type = "square";
		result = lengthSide(point1, point2) + lengthSide(point2, point3) + lengthSide(point3, point4)
				+ lengthSide(point4, point1);

		System.out.println(name);
		System.out.println(type);
		System.out.println(result);
	}

	public Figure(Point point1, Point point2, Point point3, Point point4, Point point5) {
		name = point1.getName() + point2.getName() + point3.getName() + point4.getName() + point5.getName();
		type = "polygon";
		result = lengthSide(point1, point2) + lengthSide(point2, point3) + lengthSide(point3, point4)
				+ lengthSide(point4, point5) + lengthSide(point5, point1);

		System.out.println(name);
		System.out.println(type);
		System.out.println(result);
	}

	public double lengthSide(Point a, Point b) {
		x = b.getX() - a.getX();
		y = b.getY() - a.getX();
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)) * 0.5);
	}
}
