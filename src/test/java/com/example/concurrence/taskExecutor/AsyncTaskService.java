package com.example.concurrence.taskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cuiyy on 2018/1/4.
 */
@Service
public class AsyncTaskService {

    private static final SimpleDateFormat dateFormate=new SimpleDateFormat("HH:mm:ss");
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i + 1));
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次"+dateFormate.format(new Date()));
    }
    @Scheduled(cron="0 4 1 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dateFormate.format(new Date())+"执行");
    }

}
