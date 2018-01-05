
package com.example.concurrence;

/**
 * Created by cuiyy on 2017/11/29.
 */
public class Thread_test implements Runnable {

    public Thread_test(){
        System.out.println("线程任务开始。。。");
    }

    @Override
    public void run() {
        System.out.println("线程任务进行中...");
        Thread.yield();
        System.out.println("线程任务进行中...");
        Thread.yield();
        System.out.println("线程任务进行中...");
        Thread.yield();

        System.out.println("线程任务处理完成.");
    }
}
