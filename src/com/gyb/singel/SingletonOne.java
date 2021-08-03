package com.gyb.singel;

/**
 * @author gb
 * @version 1.0
 * description:单例模式01-饿汉式,这是最简单的单例模式,并且是线程安全的，
 * 缺点：类加载的时候就完成了实例化，如果不使用这个类，依然也实例化了
 * @date 2021/7/24 1:25
 */

public class SingletonOne {

    private static final SingletonOne SINGLETON_ONE = new SingletonOne();

    /**
     * 注意：这里是私有的构造方法，这就导致无法在其他类中使用构造方法来创建对象
     **/
    private SingletonOne() {
    }

    public SingletonOne getInstance() {
        return SINGLETON_ONE;
    }
}
