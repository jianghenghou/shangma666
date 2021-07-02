package com.javasm.springbootmybatis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author：jhh
 * @Version：1.0
 * @Date：2021/6/30-22:14
 * @Since:jdk1.8
 */

@Component
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    public void sendEmail(String email) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);

        //耗时的操作
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("xxxx小红花");
        simpleMailMessage.setText("小花花送给你"+"666666");
        simpleMailMessage.setFrom("李来来的<jhh13115147529@163.com>");
        simpleMailMessage.setTo(email);
        javaMailSender.send(simpleMailMessage);
    }
}
