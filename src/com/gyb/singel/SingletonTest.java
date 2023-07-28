package com.gyb.singel;

/**
 * @author GB
 * @desc
 * @date 2023/9/12 09:02
 */
public class SingletonTest {
    private static Object lock = new Object();
    private SingletonTest(){
    }

    public static volatile SingletonTest test;

    public static SingletonTest getInstance(){
        if(test == null){
            synchronized (lock) {
                if(test == null){
                    test = new SingletonTest();
                }
            }
        }
        return test;
    }

}
