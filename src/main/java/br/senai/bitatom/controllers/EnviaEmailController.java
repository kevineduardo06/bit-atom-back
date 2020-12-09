package br.senai.bitatom.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@Controller
@RequestMapping(value = "/api/envia")
public class EnviaEmailController {

//    @Autowired
//    private JavaMailSender emailSender;
//
//    @GetMapping
//    public void sendSimpleMessage(){
//
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("kevineduardo048@gmail.com.com");
//        message.setTo("kevineduardo4@hotmail.com");
//        message.setSubject("ola");
//        message.setText("ola");
//        emailSender.send(message);
//
//    }
}
