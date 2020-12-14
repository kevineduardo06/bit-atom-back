package br.senai.bitatom.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@Controller
@RequestMapping(value = "/api/envia")
public class EnviaEmailController {



//        @Autowired
//        private JavaMailSender mailSender;
//
//        public  void enviar() {
//            SimpleMailMessage email = new SimpleMailMessage();
//            email.setTo("kevineduardo048@gmail.com");
//            email.setSubject("Teste envio de e-mail");
//            email.setText("ola");
//            mailSender.send(email);
//        }
    }



