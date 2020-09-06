/*a)	Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth 
 Добавить гетеры, сетеры.*/

package by.academy.homework.homework6;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private Date dateOfBirth;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, int age, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
