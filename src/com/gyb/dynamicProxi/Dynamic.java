package com.gyb.dynamicProxi;

import java.lang.reflect.Proxy;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/12 15:16
 */

public class Dynamic {

    public static void main(String[] args) {
    Broker broker = new Singer();

        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(broker);
        ClassLoader classLoader = broker.getClass().getClassLoader();
        Class<?>[] interfaces = broker.getClass().getInterfaces();

        Broker o = (Broker) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        o.sing();
        o.getMoney();



    }
}
