package ca.sheridancollege.beans;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="Contact")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //this annotation to define primary key to the db
	@GeneratedValue
	@Column(name = "ID")  //column header name in database
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Number")
	private String number;
	@Column(name = "Email")
	private String email;
	
	
	/**
	 * Empty constructor
	 */
	public Person() {
		//super();
	}

	/**
	 * @param name
	 * @param number
	 * @param email
	 */
	public Person(String name, String number, String email) {
		//super();
		this.name = name;
		this.number = number;
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
