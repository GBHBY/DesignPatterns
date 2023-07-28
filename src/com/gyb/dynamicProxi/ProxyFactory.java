package com.gyb.dynamicProxi;

import java.lang.reflect.Proxy;

/**
 * @author GB
 * @desc
 * @date 2023/9/4 22:33
 */
public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(T target){
        return (T) Proxy.newProxyInstance(
                  target.getClass().getClassLoader()
                , target.getClass().getInterfaces()
                , new InvocationHandlerImpl(target)
                );
    }

}
