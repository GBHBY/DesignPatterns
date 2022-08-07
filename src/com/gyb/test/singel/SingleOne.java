package com.gyb.test.singel;

/**
 * Description:
 * 缺点：类加载的时候就会创建一个对象。但保证了线程安全
 * 饿汉式
 *
 * @author GB
 * @date 2022/8/7 18:31
 */
public class SingleOne {
    private static final SingleOne SINGLE_ONE = new SingleOne();

    private SingleOne() {
    }

    public static SingleOne getSingleOne() {
        return SINGLE_ONE;
    }
}
