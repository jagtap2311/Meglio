package com.action;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail
{
	public  void sendMail(String usermail,String sub,String msgcontent) throws Exception 
	{      
	
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator()
				{
					protected PasswordAuthentication getPasswordAuthentication()
					{
						return new PasswordAuthentication("rknoulakha@gmail.com", "ranu@23#may$92");
					}
				});

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("rknoulakha@gmail.com"));
				SignUpBean sb=new SignUpBean();
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("" +usermail));
				message.setSubject(sub);
				message.setText(msgcontent);	
				Transport.send(message);
			
	}
}