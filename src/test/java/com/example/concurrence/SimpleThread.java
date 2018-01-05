package com.example.concurrence;

/**
 * Created by cuiyy on 2017/12/6.
 */
public class SimpleThread extends Thread {
    private int countDown=5;
    private static int threadCount=0;
    public SimpleThread(){
        super(Integer.toString(++threadCount));
        start();
    }
    public String toString(){
        return "#"+getName()+"("+countDown+")";
    }
}
