package com.example.ch14.back;

import com.example.ch14.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.ch14.back.config.BackOfficeConfiguration;

public class BackOfficeMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BackOfficeConfiguration.class);

        BackOffice backOffice = context.getBean(BackOffice.class);
        Mail mail = backOffice.receiveMail();
        System.out.println("Mail #" + mail.getMailId() + " received");

    }
}
