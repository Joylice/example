package com.example.concurrence.flyweight;

/**
 * Created by cuiyy on 2017/12/21.
 */
//具体享元类
public class ConcreteChess implements ChessFlyWeight {

    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置:" + c.getX());
    }
}
