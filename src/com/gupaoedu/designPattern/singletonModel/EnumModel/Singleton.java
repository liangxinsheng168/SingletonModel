package com.gupaoedu.designPattern.singletonModel.EnumModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public enum Singleton {

    INSTANCE;

    private Singleton () {}

    public static Singleton getInstance() {

        return INSTANCE;

    }
}
