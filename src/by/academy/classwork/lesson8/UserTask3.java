package by.academy.classwork.lesson8;

public class UserTask3 {

	private String login;
	private String password;

	public UserTask3() {
		super();
	}

	public UserTask3(String login, String password) {
		super();
		this.password = password;
		this.login = login;
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog(login, password);
	}

	public static class Query {

		Query() {
			super();
		}

		public void printToLog(String login, String password) {
			System.out.println("User login: " + login + ", password: " + password + " send a request");
		}
	}
}