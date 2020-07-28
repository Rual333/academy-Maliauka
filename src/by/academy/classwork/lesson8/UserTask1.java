package by.academy.classwork.lesson8;

public class UserTask1 {
	private String login;
	private String password;

	public UserTask1() {
		super();
	}

	public UserTask1(String login, String password) {
		super();
		this.password = password;
		this.login = login;
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public void createQuery(String log, String pas) {
		Query query = new Query(log, pas);
		query.printToLog();
	}

	public class Query {

		Query() {
			super();
		}

		Query(String login, String password) {
			super();
			UserTask1.this.password = password;
			UserTask1.this.login = login;
		}

		public void printToLog() {
			System.out.println("User login: " + login + ", password: " + password + " send a request");
		}
	}
}
