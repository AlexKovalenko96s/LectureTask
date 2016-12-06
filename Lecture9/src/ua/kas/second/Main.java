package ua.kas.second;

public class Main {

	public static void main(String[] args) {
		Conttroller controller = new Conttroller();

		controller.add("alex", "1qw21qw2", "KAS");
		controller.add("jeka", "potolok111", "BEP");

		controller.see();

		System.out.println("------");

		controller.remove(2);
		controller.see();

		System.out.println("------");

		controller.clear();
		controller.see();

	}

}
