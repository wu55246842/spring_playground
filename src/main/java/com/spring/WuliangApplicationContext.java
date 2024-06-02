package com.spring;

public class WuliangApplicationContext {

    private Class configClass;

    public WuliangApplicationContext(Class configClass){
        this.configClass = configClass;
        ComponentScan componentScanAnnotation = (ComponentScan) configClass.getDeclaredAnnotation(ComponentScan.class);
        String path = componentScanAnnotation.value();
        System.out.println(path);
    }

    public Object getBean(String beanName){
        return null;
    }

}
