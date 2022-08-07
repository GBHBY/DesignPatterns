package com.gyb.singel;

import java.util.Properties;

/**
 * @author gb
 * @version 1.0
 * description:单例模式05:最完美的，解决线程同步，防止反序列化
 * @date 2021/7/24 1:25
 */

public enum SingletonFive {
    INSTANCE;
    private static Properties prop;


    public void m() {
    }

}
