package email_app;

public class Email_App {

	public static void main(String[] args) {
		Email em1 = new Email("Rachit","Jain");
		
		em1.setmailboxcapacity(600);
		System.out.println(em1.showInfo());
	}

}
