package by.academy.homework.homework3.products;

public enum DealStatus {
	NEW("New"), IN_PROGRESS("In progress"), DONE("Done");
	
	private String status;
	
	DealStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
