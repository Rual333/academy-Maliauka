package by.academy.classwork.lesson16;

public class PrivilegeCustomer extends Customer {
	
	private int privilegeAccountNo;

	public PrivilegeCustomer() {
		super();
	}

	public int getPrivilegeAccountNo() {
		return privilegeAccountNo;
	}

	public void setPrivilegeAccountNo(int privilegeAccountNo) {
		this.privilegeAccountNo = privilegeAccountNo;
	}

}
