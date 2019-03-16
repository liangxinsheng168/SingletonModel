package com.gupaoedu.designPattern.singletonModel.lazyModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {}

    public static Singleton getInstance() {

        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
