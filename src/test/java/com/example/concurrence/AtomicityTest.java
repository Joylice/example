package com.example.concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cuiyy on 2017/12/12.
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    public int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        Thread.yield();
        i++;
    }

    @Override
    public void run() {
        while (true)
            evenIncrement();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        executorService.execute(at);
        while (true) {
            int val = at.getValue();
            System.out.println(val);
            if (val % 2 != 0){
                System.out.println("奇数"+val);
                System.exit(0);
            }
        }

    }
}
