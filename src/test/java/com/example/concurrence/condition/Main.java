package com.example.concurrence.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cuiyy on 2018/1/5.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name")
                + "系统下的列表命令为：" + listService.showListCmd());
    }
}
