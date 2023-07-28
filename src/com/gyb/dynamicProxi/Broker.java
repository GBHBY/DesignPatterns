package com.gyb.dynamicProxi;

/**
 * @author gb
 * @version 1.0
 * description:经纪人
 * @date 2021/8/12 15:11
 */

public interface Broker {
    /**
     * 赚钱
     */
    void getMoney(Integer money);

    /**
     * 唱歌
     */
    void sing();
}
