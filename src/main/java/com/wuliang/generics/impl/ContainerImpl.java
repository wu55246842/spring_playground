package com.wuliang.generics.impl;

import com.wuliang.generics.i.IContainer;

import java.util.ArrayList;
import java.util.List;

public class ContainerImpl<T> implements IContainer<T>{

    private List<T> tList = new ArrayList<T>();

    @Override
    public void add(T t) {
        tList.add(t);
    }

    @Override
    public T get(int index) {
        return tList.get(index);
    }
}
