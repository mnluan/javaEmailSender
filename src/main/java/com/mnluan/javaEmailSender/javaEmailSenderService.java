package com.mnluan.javaEmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class javaEmailSenderService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(String toEmail, String body, String subject, String attachment)throws MessagingException {
		MimeMessage mimeMSG = javaMailSender.createMimeMessage();
		MimeMessageHelper msgHelper = new MimeMessageHelper(mimeMSG, true);
		
		msgHelper.setFrom("sender email here");
		msgHelper.setTo(toEmail);
		msgHelper.setText(body);
		msgHelper.setSubject(subject);
		
		FileSystemResource fileSystemResource = 
				new FileSystemResource(new File(attachment));
		msgHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
		javaMailSender.send(mimeMSG);
		
		System.out.println("Your email has been sent successfully");
		
		
	}
}
