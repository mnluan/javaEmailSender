package com.mnluan.javaEmailSender;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaEmailSenderApplication {
	
	@Autowired
	private javaEmailSenderService emailSenderService;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail()throws MessagingException{
		emailSenderService.sendMail("recipientEmail@example.com", "Messeger Here", "Subject Here", "location//from//archive.pdf");
	}
}
