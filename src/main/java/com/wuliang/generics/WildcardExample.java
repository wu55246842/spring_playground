package com.wuliang.generics;

import java.util.List;

public class WildcardExample {

    public static void printNumber(List<? extends Number> list){
        for (Number n :list){
            System.out.println(n);
        }
    }
}
