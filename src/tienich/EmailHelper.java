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
public class EmailHelper extends Thread {

    private String destination;
    private String content;
    private String title;
    public static int codeReset;
    private final String EMAIL_ADDRESS = "nhom5fafo@gmail.com";
    private final String PASS_EMAIL = "12345678@a";

    private EmailHelper(String destination) {
        codeReset = (int) (Math.random() * 899999) + 100000;
        this.destination = destination;
        this.title = "[FaFo] Reset mật khẩu";
        this.content = 
                "<div style=\"width: 410px; height: 500px; display: block; margin: 0 auto;\">"
                + "<p style=\"color: #3b5998; font-size: 19px;font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;\">"
                + "   FastFood"
                + "</p>"
                + "<p style=\"font-size:20px;font-family:Helvetica Neue,Helvetica,Lucida Grande,tahoma,verdana,arial,sans-serif;\"> "
                + "   Hi " + Auth.user.getTenNhanVien() + ","
                + "   <br><br> "
                + "   Chúng tôi nhận được yêu cầu khôi phục mật khẩu của bạn. <br> "
                + "   Nhập đoạn code phía dưới để khôi phục mật khẩu: "
                + "</p> "
                + "<p style=\"text-align: center;font-size:25px;font-family:LucidaGrande,tahoma,verdana,arial,sans-serif;padding:10px;background-color:#f2f2f2;font-weight: bold;\"> " + 
                      codeReset + ""
                + "</p> "
                + "<b>*Lưu ý: code này chỉ tồn tại trong vòng 1 phút.</b> "
                + "<p>Thanks,<br>FaFo Team.</p>"
                + "</div>";

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
        mess.setSubject("[FaFo] Lấy lại mật khẩu");
        mess.setReplyTo(InternetAddress.parse(destination));
        mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destination));
        mess.setContent(content, "text/html; charset=utf-8");
        return mess;
    }

    public static void sendEmail(String destination) {
        EmailHelper em = new EmailHelper(destination);
        em.start();
    }

    @Override
    public void run() {
        try {
            Transport.send(this.getMessage());
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}
