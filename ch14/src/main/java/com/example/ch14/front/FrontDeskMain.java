package com.example.ch14.front;

import com.example.ch14.Mail;
import com.example.ch14.front.config.FrontOfficeConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class FrontDeskMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(FrontOfficeConfiguration.class);

        FrontDesk frontDesk = context.getBean(FrontDesk.class);
        frontDesk.sendMail(new Mail("1234", "US", 1.5));
    }
}
