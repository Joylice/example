package com.example.concurrence;

import java.util.concurrent.Callable;

/**
 * Created by cuiyy on 2017/11/29.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }
}
