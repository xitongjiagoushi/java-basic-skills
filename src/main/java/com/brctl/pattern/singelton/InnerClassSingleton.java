package com.brctl.pattern.singelton;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * InnerClassSingleton<br/>
 * implements java.io.Serializable, ruining singleton by deserialize
 * BEST practice for the Singleton Pattern.
 * Created by duanxiaoxing on 17/1/21.
 */
@Slf4j
public class InnerClassSingleton implements Serializable {

    // private constructor
    private InnerClassSingleton() {

    }

    // inner class to hold the singleton instance
    private static class InnerClassSingletonHolder {
        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

    // class method to get the singleton
    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.SINGLETON;
    }


    public static void main(String[] args) throws Exception {
        InnerClassSingleton singleton = InnerClassSingleton.getInstance();
        InnerClassSingleton deserializeSingleton = null;

        // serialize
        try (FileOutputStream fos = new FileOutputStream("object.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton);
            oos.close();
        }

        // deserialize
        try (FileInputStream fis = new FileInputStream("object.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            deserializeSingleton = (InnerClassSingleton) ois.readObject();
        }

        log.info("is the same instance: {}", singleton == deserializeSingleton);
    }

}
