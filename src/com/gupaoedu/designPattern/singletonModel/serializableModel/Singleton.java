package com.gupaoedu.designPattern.singletonModel.serializableModel;

import java.io.Serializable;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Singleton implements Serializable {

    private static Singleton singleton = new Singleton();

    private Singleton () {}

    public static Singleton getInstance() {

        return singleton;

    }

    private Object readResolve(){

        return singleton;

    }

}
