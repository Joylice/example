package com.example.concurrence.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cuiyy on 2018/1/4.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(scheduleConfig.class);

    }
}
