package ua.kas.main;

public class Main {

	public static void main(String[] args) {
		double opr1 = 10;
		double opr2 = 20;

		Calculator calculator = new Calculator();

		System.out.println(calculator.add(opr1, opr2));
		System.out.println(calculator.mult(opr1, opr2));

		AddInterface addInterface = calculator;
		System.out.println(addInterface.add(opr1, opr2));

		MultInterface multInterface = calculator;
		System.out.println(multInterface.mult(opr1, opr2));
	}

}
