package com.example.concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by cuiyy on 2017/12/8.
 */
class ExceptionThread2 implements Runnable {

    @Override
    public void run() {
        Thread t = new Thread();
        System.out.println("run by" + t);
        System.out.println("eh=" + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught" + e);
    }
}

class HandlerThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + "creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created" + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh=" + t.getUncaughtExceptionHandler());

        return t;
    }
}


public class CaptureUncaughtException {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        ExecutorService exec= Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread2());
    }
}
