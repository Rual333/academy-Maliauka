package by.academy.homework.homework3.products;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import by.academy.homework.homework2.validation.BelarusPhoneValidator;
import by.academy.homework.homework2.validation.EmailValidator;
import by.academy.homework.homework2.validation.ValidateDate;

public class User {

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	private String name = "No name";
	private String phone = "No phone";
	private String email = "No email";
	private Date dateOfBirth;
	private Scanner sc = new Scanner(System.in);

	public User() {
		super();
	}

	public User(String name) throws ParseException {
		super();
		this.name = name;
		setDateOfBirth();
		setEmail();
		setPhone();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		String strPhone;
		BelarusPhoneValidator pVal = new BelarusPhoneValidator();
		do {
			System.out.println("Enter phone number: ");
			strPhone = sc.nextLine();
			if (pVal.validate(strPhone)) {
				this.phone = strPhone;
			} else {
				System.out.println("You typed wrong format of phone number, try again!");
			}
		} while (!pVal.validate(strPhone));
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		String strEmail;
		EmailValidator eVal = new EmailValidator();
		do {
			System.out.println("Enter email: ");
			strEmail = sc.nextLine();
			if (eVal.validate(strEmail)) {
				this.email = strEmail;
			} else {
				System.out.println("You typed wrong email, try again!");
			}
		} while (!eVal.validate(strEmail));
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth() throws ParseException {
		String dOfB;
		while (true) {
			System.out.println("Enter date of birth (valid formats are \"dd/MM/yyyy\" or \"dd-MM-yyyy\"): ");
			dOfB = sc.nextLine();
			if (ValidateDate.validate1(dOfB)) {
				this.dateOfBirth = format1.parse(dOfB);
				return;
			} else if (ValidateDate.validate2(dOfB)) {
				this.dateOfBirth = format2.parse(dOfB);
				return;
			}
			System.out.println("You typed wrong format of date!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("name: ").append(name).append(", phone = ").append(phone).append(", email = ").append(email)
				.append(", dateOfBirth = ").append(Deal.dateformat.format(dateOfBirth)).append(";\n");
		return builder.toString();
	}
}