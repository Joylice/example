package com.example.concurrence;

import java.util.concurrent.TimeUnit;

/**
 * Created by cuiyy on 2017/12/6.
 */
public class SimpleDeamons implements Runnable {
    @Override
    public void run() {

        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
