package com.example.concurrence.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuiyy on 2017/12/21.
 */
//享元工厂
public class ChessFlyWeightFactory {
    private static Map<String, ChessFlyWeight>
            map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) == null) {
            ChessFlyWeight chessFlyWeight = new ConcreteChess(color);
            map.put(color, chessFlyWeight);
            return chessFlyWeight;
        } else {
            return map.get(color);
        }
    }
}

class Client {
    public static void main(String[] args) {
        ChessFlyWeight chessOne=ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chessTwo=ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chessOne);
        System.out.println(chessTwo);

        System.out.println("---增加外部状态的处理-----");
        chessOne.display(new Coordinate(10,10));
        chessTwo.display(new Coordinate(20,20));

    }
}
