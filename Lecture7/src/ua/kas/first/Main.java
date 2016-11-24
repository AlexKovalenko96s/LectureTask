package ua.kas.first;

public class Main {

	public static void main(String[] args) {
		Addres addres = new Addres();
		addres.setIndex(25000);
		addres.setCountry("Ua");
		addres.setCity("Odessa");
		addres.setStreet("Dnepr. dor");
		addres.setHouse(72);
		addres.setApartment(187);

		System.out.println(addres.getIndex() + " " + addres.getCountry() + " " + addres.getCity() + " "
				+ addres.getStreet() + " " + addres.getHouse() + " " + addres.getApartment());
	}

}
