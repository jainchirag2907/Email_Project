package email_app;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String department;
	private String email;
	private String password;
	private int defaultPasswordLength = 10;
	private String alternateemail;
	private int mailboxcapacity = 500;

	//Constructor to receive firstname and last name

	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created: "+ this.firstname + " " + this.lastname );

		//Call a method asking for the department - it will return the department

		this.department = setDepartment();
		System.out.println("Department:" + this.department );


		//Call a method to generate random password

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password is:" + this.password);


		//Combine Elements to generate email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department +"company.com";
		System.out.println("Your Email :" + email);



	}




	//Ask for department

	private String setDepartment() {

		System.out.print("Department Codes\n1 for Technical\n2 for HR\n3 for Web Develpoment\n0 for None\nEnter the Department Code:"); 		 	
		Scanner scn = new Scanner(System.in);
		int dep_Choice= scn.nextInt();

		if(dep_Choice==1) {
			return "Technical";
		}
		else if(dep_Choice==2) {
			return "HR";
		}
		else if(dep_Choice==3) {
			return "Web development";
		}
		else if(dep_Choice==0) {
			return "None";
		}
		else {
			return "Wrong Choice";
		}


	}

	//Generate a random password

	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYYZ0123456789!@#$%&";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand =  (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);
	}

	//Set mailbox Capacity

	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}

	//Set alternate  email

	public void setalternateemail(String altEmail) {
		this.alternateemail = altEmail;
	}

	//Change the Password
	public void changePassword(String password) {
		this.password = password;
	}

	//get mail capacity
	public int getMailBoxCapacity(){
		return mailboxcapacity;
	}

	//get alternate email
	public String getAlternateEmail(){
		return alternateemail;
	}

	//get password
	public String getpassword(){
		return password;
	}

	//showInfo
	public String showInfo() {
		return "Display Name:" + firstname + " " + lastname + "\n"+
				"Company Email:" + email + "\n" +
				"MailBox Capacity:" + mailboxcapacity + "mb";

	}
}
