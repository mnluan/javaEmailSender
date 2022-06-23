# javaEmailSender
Email sending microservice powered by Java Spring boot

* Developed with Java 8 / Maven;
* Spring Boot Framework 2.7.1
* Dependency: Spring Framework's JavaMailSender

### How to use:
You'll have to change the "javaEmailSenderService.java" and "JavaEmailSenderApplication.java" files to include your email, the recipient's email and the directory of a file you want to archive to the email.

In addition, you must also change the "application.properties" file, including your email <b>(it needs to be a Gmail)</b>, and your special password for applications.
Create the special password for apps by going to: 
https://myaccount.google.com/security then go to password for apps, or go to: 
https://myaccount.google.com/apppasswords and create the password. 

* <b>Note: to create an app password you must first activate the two-step sign-in, if you have not already activated it, activate it here: https://myaccount.google.com/signinoptions/two-step-verification</b>
