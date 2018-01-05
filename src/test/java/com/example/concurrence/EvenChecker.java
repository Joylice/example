package com.example.concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cuiyy on 2017/12/11.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            System.out.println("数字："+val);
            if (val % 2 != 0) {
                System.out.println(val+"not even!");
                generator.cancel();
            }
        }
    }
    public static void  test(IntGenerator gp,int count){
        System.out.println("Press Ctrl-C to exit");
        ExecutorService executorService= Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(gp,i));
        }
          executorService.shutdown();
    }
    public static void test(IntGenerator gp){
        test(gp,10);
    }
}
