package com.baeldung.spring.mail;

import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Tushar on 8/22/2017.
 */
public interface EmailService {
    void sendSimpleMessage(String to,
                           String subject,
                           String text);
    void sendSimpleMessageUsingTemplate(String to,
                                        String subject,
                                        SimpleMailMessage template,
                                        String ...templateArgs);
    void sendMessageWithAttachment(String to,
                                   String subject,
                                   String text,
                                   String pathToAttachment);
}
