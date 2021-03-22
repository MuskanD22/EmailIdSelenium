package Email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException {
		
		System.out.println("Sending mail......");
		sendMail();
		System.out.println("mail sent............");
	}

	public static void sendMail() throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("muskandureja1999@gmail.com", "muskan@D123"));
		email.setSSLOnConnect(true);
		email.setFrom("Muskan@gmail.com");
		email.setSubject("Test Mail for Email testing using selenium..");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("csecec.1702722@gmail.com");
		email.send();

	}
}
