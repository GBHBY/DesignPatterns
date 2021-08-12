package com.gyb.dynamicProxi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/12 15:13
 */

public class InvocationHandlerImpl implements InvocationHandler {

    private Object sing;

    public InvocationHandlerImpl(Object sing) {
        this.sing = sing;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始调用代理方法");
        System.out.println("method： " + method);
        System.out.println("method名：  " + method.getName());
        Object invoke = method.invoke(sing, args);

        System.out.println("调用之后");


        return invoke;
    }
}
