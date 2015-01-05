package login;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	
	@Id @GeneratedValue
	Long id;
	
	private String name;
	private String surname;
	private String password;
	private int age;
	private Date signupDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name,String surname,String password,int age)
	{
		this.name=name;
		this.surname=surname;
		this.password=password;
		this.age=age;
		this.signupDate = new Date(System.currentTimeMillis());
	}
			
}
