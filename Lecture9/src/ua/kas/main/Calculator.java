package ua.kas.main;

class Calculator implements AddInterface, MultInterface {

	@Override
	public double add(double opr1, double opr2) {
		return opr1 + opr2;
	}

	@Override
	public double mult(double opr1, double opr2) {
		return opr1 * opr2;
	}

}
