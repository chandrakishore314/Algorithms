package org.bridgelabz.application.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Utility {
	public static String encryptPasswors(String password) {
		String generatedPassword=null;
		StringBuffer sb=new StringBuffer();
				try {
					MessageDigest md=MessageDigest.getInstance("MD5");
					md.update(password.getBytes());
					byte[] bytes=md.digest();
					for(int i=0;i<bytes.length;i++) {
						sb.append(Integer.toString((bytes[i] & 0xff)+0x100,16).substring(1));
					}
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				}
				generatedPassword=sb.toString();
				System.out.println(generatedPassword+"   generated password");
				return generatedPassword;
			}
			
			
			public static String sendMsg(String email) {
				String forgotpassword=null;
				StringBuffer sb=new StringBuffer();
				Random random=new Random();
				for(int i=0;i<4;i++) {
					sb.append(random.nextInt(9));
				}
				forgotpassword=sb.toString();
				  final String sender = "chandrakishore314@gmail.com"; 
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
			            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); 
			            message.setSubject("Testing Gmail TLS");
			            message.setText("Dear Mail Crawler,"
			                    + "\n\n your  password for change the password    "+forgotpassword);
			            Transport.send(message);
			            System.out.println("Done with the message sending");
			        } catch (MessagingException e) {
			            e.printStackTrace();
			        }
					return forgotpassword;
			}
}
