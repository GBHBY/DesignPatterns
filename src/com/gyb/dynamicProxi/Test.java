package com.gyb.dynamicProxi;

import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author GB
 * @date 2022/5/14 20:06
 *
 * <pre>
 *              www.dustess.com
 *      Copyright (c) 2022. All Rights Reserved.
 * </pre>
 */
@Component("test1")
public class Test {
    public static void main(String[] args) {
        Broker broker = new Singer();
        Broker o = ProxyFactory.getProxy(broker);
        o.getMoney(123);
        o.sing();


    }

}
