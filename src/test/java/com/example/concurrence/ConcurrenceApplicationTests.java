package com.example.concurrence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConcurrenceApplicationTests {


    //没有参数返回的线程调用
    @Test
    public void contextLoads() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            //startThread();
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

    public void startThread() {
        LiftOff liftOff = new LiftOff();
        Thread t = new Thread(liftOff);
        t.start();
        System.out.println("waiting for LiftOff");
    }

    //带参数且线程结果返回测试
    @Test
    public void taskWithResult() throws ExecutionException, InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futures = new ArrayList<Future<String>>();
        for (int i = 0; i < 5; i++) {
            Future<String> future = exec.submit(new TaskWithResult(i));
            futures.add(future);
        }

        for (Future<String> f : futures) {
            System.out.println(f.get());
        }
        exec.shutdown();
    }

    //优先级设置
    @Test
    public void taskPriorityResult() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        // exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        exec.shutdown();


    }

    @Test
    public void simpleDeamonTest() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDeamons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
