package com.example.concurrence.flyweight;

/**
 * Created by cuiyy on 2017/12/21.
 */
//抽象享元类
public interface ChessFlyWeight {
    String getColor();//获取颜色，内部状态
    void display(Coordinate c);//获取展示位置  外部状态
}

