package com.example.concurrence.schedule;

import com.example.concurrence.SimplePriorities;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cuiyy on 2018/1/4.
 */
@Service
public class ScheduleService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportMessage() {
        System.out.println("每隔五秒中执行一次 " + dateFormat.format(new Date()));
    }

   @Scheduled(cron = "0 4 1 ? * *")
    public void reportDate() {
        System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
    }


}
