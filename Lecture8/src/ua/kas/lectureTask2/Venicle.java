package ua.kas.lectureTask2;

public abstract class Venicle {

	protected String city;

	protected int cost;
	protected int speed;
	protected int year;

	abstract String getCity();

	abstract void setCity(String city);

	abstract int getCost();

	abstract void setCost(int cost);

	abstract int getSpeed();

	abstract void setSpeed(int speed);

	abstract int getYear();

	abstract void setYear(int year);

}
