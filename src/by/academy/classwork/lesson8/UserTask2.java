package by.academy.classwork.lesson8;

import by.academy.classwork.lesson8.UserTask1.Query;

public class UserTask2 {
	private String login;
	private String password;

	public UserTask2() {
		super();
	}

	public UserTask2(String login, String password) {
		super();
		this.password = password;
		this.login = login;
	}

	public void createQuery() {
		class Query {
			final String login = UserTask2.this.login;
			final String password = UserTask2.this.password;

			public void printToLog() {
				System.out.println("User login: " + login + ", password: " + password + " send a request");
			}
		}

		Query query = new Query();
		query.printToLog();
	}

}
