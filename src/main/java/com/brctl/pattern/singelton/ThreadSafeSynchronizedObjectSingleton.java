package com.brctl.pattern.singelton;

/**
 * ThreadSafeSynchronizedMethodSingeleton
 * Use object level synchronized to guarantee thread safe.
 * Created by duanxiaoxing on 17/1/21.
 */
public class ThreadSafeSynchronizedObjectSingleton {

    private static ThreadSafeSynchronizedObjectSingleton instance = null;

    // private constructor
    private ThreadSafeSynchronizedObjectSingleton() {

    }

    // class method to get the singleton
    public static ThreadSafeSynchronizedObjectSingleton getInstance() {
        synchronized (lock) {
            if(instance == null) {
                instance = new ThreadSafeSynchronizedObjectSingleton();
            }
        }
        return instance;
    }

    // dummy object for synchronized use
    static private class Lock {

    }
    private static final Lock lock = new Lock();
}
