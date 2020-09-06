package by.academy.homework.homework6;

import java.util.Date;

public class User extends Person {
	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User(String firstName, String lastName, int age, Date dateOfBirth) {
		super(firstName, lastName, age, dateOfBirth);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@SuppressWarnings("unused")
	private void printUserInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [login=").append(login).append(", password=").append(password).append(", email=")
				.append(email).append("]");
		return builder.toString();
	}

}
