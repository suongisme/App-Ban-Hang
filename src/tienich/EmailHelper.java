/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienich;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author SuongNguyen
 */
public class EmailHelper extends Thread{
    private String destination;
    private String content;
    private String title;
    private final String EMAIL_ADDRESS = "edusys58@gmail.com";
    private final String PASS_EMAIL = "nguyenvansuong";

    private EmailHelper(String destination, String content, String title) {
        this.destination = destination;
        this.content = content;
        this.title = title;
    }
    
    private Authenticator getAuthenticator() {
        return new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_ADDRESS, PASS_EMAIL);
            }
        };
    }
    
    private Properties getProperties() {
        Properties pro = new Properties();
        pro.put("mail.smtp.host", "smtp.gmail.com");
        pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.port", 587);
        return pro;
    }
    
    private Session getSession() {
        return Session.getInstance(this.getProperties(), this.getAuthenticator());
    }
    
    private Message getMessage() throws MessagingException {
        Message mess = new MimeMessage(this.getSession());
        mess.setSubject(title);
        mess.setReplyTo(InternetAddress.parse(destination));
        mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destination));
        mess.setText(content);
        return mess;
    }
    
    public static void sendEmail(String destination, String content, String title){
        EmailHelper em = new EmailHelper(destination, content, title);
        em.start();
    }

    @Override
    public void run() {
        try {
            Transport.send(this.getMessage());
        } catch (MessagingException ex) {
            
        }
    }
}
