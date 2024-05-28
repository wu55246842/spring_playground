package com.spring;

public class WuliangApplicationContext {

    private Class configClass;

    public WuliangApplicationContext(Class configClass){
        this.configClass = configClass;
    }

    public Object getBean(String beanName){
        return null;
    }

}
