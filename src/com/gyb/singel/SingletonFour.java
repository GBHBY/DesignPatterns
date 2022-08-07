package com.gyb.singel;

/**
 * @author gb
 * @version 1.0
 * description:单例模式04:完美的解决了类加载就初始化的问题，这个写法较好一些
 * @date 2021/7/24 1:25
 */

public class SingletonFour {


    private SingletonFour() {
    }

    private static class Singleton {
        private final static SingletonFour SINGLETON_FOUR = new SingletonFour();
    }

    public static SingletonFour getInstance() {
        return Singleton.SINGLETON_FOUR;
    }
}
