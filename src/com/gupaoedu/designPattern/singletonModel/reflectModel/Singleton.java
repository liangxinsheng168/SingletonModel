package com.gupaoedu.designPattern.singletonModel.reflectModel;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() throws Exception {

        if(singleton != null){
            throw new Exception("you cannot create pojo by reflect.");
        }
    }

    public static Singleton getInstance() throws Exception {
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
