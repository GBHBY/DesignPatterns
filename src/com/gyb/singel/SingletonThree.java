package com.gyb.singel;

/**
 * @author gb
 * @version 1.0
 * description:单例模式03：解决了2的的线程安全问题
 * @date 2021/7/24 1:25
 */

public class SingletonThree {
    /**
     * 必须要加volatile，因为正常是先进行调用构造函数进行初始化，然后将初始化结果复制给引用，但是，有可能这两个步骤会发生重排，那么就会导致，
     *  第二个线程进入27行的时候就已经拿到了对象，但是对象的值都是初始值，就会导致出现bug
     **/
    private static volatile SingletonThree SINGLETON_Two;

    private SingletonThree() {
    }

    /**
     *
     **/
    public SingletonThree getInstance() {
        if (SINGLETON_Two == null) {
            synchronized (SingletonThree.class) {
//                当第一个线程已经执行到29行，第二个线程执行到26行的时候，会被阻塞住，等待锁的释放，当第一个线程拿到对象，锁释放后，
//                  第二个对象执行到第28行，会再次判断一次是否已经存在该类的实例，如果没有28行，就会再次创建一个类的实例，就i不是单例模式了。
                if (SINGLETON_Two == null) {
                    SINGLETON_Two = new SingletonThree();
                }
            }
        }
        return SINGLETON_Two;
    }
}
