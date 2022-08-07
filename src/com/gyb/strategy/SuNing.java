package com.gyb.strategy;

/**
 * @author gb
 * @version 1.0
 * description:
 * @date 2021/8/25 0:17
 */

public class SuNing implements Supplier {
    @Override
    public String getToken() {

        return "苏宁";
    }

    @Override
    public String getClientId() {
        return "suNing";
    }
}
