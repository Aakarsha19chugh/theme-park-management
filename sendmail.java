
import java.io.UnsupportedEncodingException;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Properties;
import static java.util.logging.Level.parse;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class sendmail {
    
    public void sendEmail(String to,String subject,String message) throws Exception
    {
   
        String from = "ABC";
        final String username = "aakarshachugh19@zoho.com";
        final String password = "aakarsha123";
        final String smtp_connection = "SSL";
       
        
       
                
        Properties props = new Properties();
       
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.zoho.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.zoho.com");


        Session sn = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                });

       
        javax.mail.Message msg = new MimeMessage(sn);
        msg.setFrom(new InternetAddress(username, from));
        
         InternetAddress[] parse = InternetAddress.parse(to , true);
        msg.setRecipients(javax.mail.Message.RecipientType.TO, parse);
        msg.setSubject(subject);
      
        msg.setContent(message, "text/html; charset=utf-8");
        msg.setSentDate(new java.util.Date());

        msg.saveChanges();


        Transport.send(msg);
    }
     

    
}
