package com.wuliang.generics.i;

public interface IContainer<T> {
    void add(T t);
    T get(int index);
}
