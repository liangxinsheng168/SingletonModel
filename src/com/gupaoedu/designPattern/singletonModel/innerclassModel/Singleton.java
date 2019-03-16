package com.gupaoedu.designPattern.singletonModel.innerclassModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {

        private static Singleton singleton = new Singleton();

    }

    public static Singleton getInstance() {

        return SingletonHolder.singleton;

    }
}
