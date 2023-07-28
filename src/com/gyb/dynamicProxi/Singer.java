package com.gyb.dynamicProxi;

/**
 * @author gb
 * @version 1.0
 * description:歌手
 * @date 2021/8/12 15:11
 */

public class Singer implements Broker {
    @Override
    public void getMoney(Integer money) {
        System.out.println("赚了" + money);
    }

    @Override
    public void sing() {
        System.out.println("唱歌");
    }
}
