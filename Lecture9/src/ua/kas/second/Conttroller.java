package ua.kas.second;

import java.util.ArrayList;

class Conttroller {

	private ArrayList<Bd> list = new ArrayList<>();

	Conttroller() {
		list.add(new Bd("login", "password", "fio"));
	}

	void add(String login, String password, String fio) {
		list.add(new Bd(login, password, fio));
	}

	void remove(int Id) {
		list.remove(Id);
	}

	void see() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("id = " + i + " " + list.get(i).getLogin() + " " + list.get(i).getPassword() + " "
					+ list.get(i).getFio());
		}
	}

	void clear() {
		list.clear();
	}
}
