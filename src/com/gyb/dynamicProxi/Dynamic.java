package com.gyb.dynamicProxi;

import com.gyb.SpringConfig;
import com.gyb.annotation.TimeStatistic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/12 15:16
 */

@Component("dynamic")
public class Dynamic {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Dynamic dynamic = (Dynamic) applicationContext.getBean("dynamic");
        dynamic.test();
    }

    @TimeStatistic(desc = "动态代理")
    public void test() {
        Broker broker = new Singer();

        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(broker);
        ClassLoader classLoader = broker.getClass().getClassLoader();
        Class<?>[] interfaces = broker.getClass().getInterfaces();

        Broker o = (Broker) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        o.sing();
        o.getMoney();

    }
}
