package com.gyb.dynamicProxi;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/12 15:13
 */

@Slf4j
public class InvocationHandlerImpl implements InvocationHandler {

    private Object sing;

    public InvocationHandlerImpl(Object sing) {
        this.sing = sing;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("开始调用代理方法");
        log.info("method:【{}】", method);
        log.info("method名：【{}】",method.getName());
        log.info("method param:【{}】", args);
        Object invoke = method.invoke(sing, args);
        return invoke;
    }


}
