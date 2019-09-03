import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class msgs {
	 public static void main(String[] args) {
	      String sender = "chandrakishore314@gmail.com"; 
	      Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
	      Session session = Session.getDefaultInstance(props,    
	              new javax.mail.Authenticator() {    
	           protected PasswordAuthentication getPasswordAuthentication() {    
	           return new PasswordAuthentication(sender,"9951388537");  
	           }    
	          });     
	        try {
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(sender));
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(sender)); 
	            message.setSubject("Testing Gmail TLS");
	            message.setText("Dear Mail Crawler,"
	                    + "\n\n Please do not spam my email!");
	            Transport.send(message);
	            System.out.println("Done with the message sending");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	    }
}
