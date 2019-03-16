package com.gupaoedu.designPattern.singletonModel;

import com.gupaoedu.designPattern.singletonModel.EnumModel.Singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class SingletonModelTest {

    public static void main(String[] args) throws Exception {

        //hungryModel
        com.gupaoedu.designPattern.singletonModel.hungryModel.Singleton singleton1 = com.gupaoedu.designPattern.singletonModel.hungryModel.Singleton.getInstance();
        com.gupaoedu.designPattern.singletonModel.hungryModel.Singleton singleton2 = com.gupaoedu.designPattern.singletonModel.hungryModel.Singleton.getInstance();
        System.out.println(singleton1 == singleton2);

        //lazyModel
        com.gupaoedu.designPattern.singletonModel.lazyModel.Singleton singleton3 = com.gupaoedu.designPattern.singletonModel.lazyModel.Singleton.getInstance();
        com.gupaoedu.designPattern.singletonModel.lazyModel.Singleton singleton4 = com.gupaoedu.designPattern.singletonModel.lazyModel.Singleton.getInstance();
        System.out.println(singleton3 == singleton4);

        //innerclassModel
        com.gupaoedu.designPattern.singletonModel.innerclassModel.Singleton singleton5 = com.gupaoedu.designPattern.singletonModel.innerclassModel.Singleton.getInstance();
        com.gupaoedu.designPattern.singletonModel.innerclassModel.Singleton singleton6 = com.gupaoedu.designPattern.singletonModel.innerclassModel.Singleton.getInstance();
        System.out.println(singleton5 == singleton6);

        //serializableModel
        com.gupaoedu.designPattern.singletonModel.serializableModel.Singleton singleton7 = com.gupaoedu.designPattern.singletonModel.serializableModel.Singleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(singleton7);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        com.gupaoedu.designPattern.singletonModel.serializableModel.Singleton singleton8 = (com.gupaoedu.designPattern.singletonModel.serializableModel.Singleton)ois.readObject();
        closeUtil.close(oos, ois);
        System.out.println(singleton7 == singleton8);

        //enumModel
        com.gupaoedu.designPattern.singletonModel.EnumModel.Singleton singleton11 = Singleton.INSTANCE;
        com.gupaoedu.designPattern.singletonModel.EnumModel.Singleton singleton12 = Singleton.INSTANCE;
        System.out.println(singleton11 == singleton12);

        //reflectModel
        com.gupaoedu.designPattern.singletonModel.reflectModel.Singleton singleton9 = com.gupaoedu.designPattern.singletonModel.reflectModel.Singleton.getInstance();
        Class<?> clazz = com.gupaoedu.designPattern.singletonModel.reflectModel.Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        com.gupaoedu.designPattern.singletonModel.reflectModel.Singleton singleton10 = (com.gupaoedu.designPattern.singletonModel.reflectModel.Singleton)constructor.newInstance();
        System.out.println(singleton9 == singleton10);

    }

}