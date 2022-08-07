package com.gyb.singel;

/**
 * @author gb
 * @version 1.0
 * description:单例模式02-懒汉式：什么时候用，什么时候初始化
 * @date 2021/7/24 1:25
 */

public class SingletonTwo {

    private static SingletonTwo SINGLETON_Two;


    private SingletonTwo() {
    }

    /**
     * 仔细思考，如果一个线程A进来后，发现是空的，也就是执行完了22行，此时线程挂起，
     *      另一个线程B也进来了，返现对象是空的，那么这两个线程都会执行23行代码，那么就会创建两个对象，解决办法，看SingletonThree
     **/
    public SingletonTwo getInstance() {
        if (SINGLETON_Two == null) {
            SINGLETON_Two = new SingletonTwo();
        }
        return SINGLETON_Two;
    }
}
