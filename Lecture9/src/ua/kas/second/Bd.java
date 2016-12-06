package ua.kas.second;

class Bd {

	private String login = "";
	private String password = "";
	private String fio = "";

	Bd(String login, String password, String fio) {
		super();
		this.login = login;
		this.password = password;
		this.fio = fio;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

}
