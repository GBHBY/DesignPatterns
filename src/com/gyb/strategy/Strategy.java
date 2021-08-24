package com.gyb.strategy;

/**
 * @author gb
 * @version 1.0
 * description:策略模式,说白了就是多态
 * @date 2021/8/23 23:17
 */

public class Strategy {
    public static void main(String[] args) {
        Supplier supplier = new SuNing();
        System.out.println(getToken(supplier));
    }


    public static String getToken(Supplier supplier) {
        return supplier.getToken() + supplier.getClientId();
    }


}
