package com.example.concurrence.condition;

/**
 * Created by cuiyy on 2018/1/5.
 */
public class WindowsListSerivce implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
