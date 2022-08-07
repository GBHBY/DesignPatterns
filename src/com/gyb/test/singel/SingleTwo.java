package com.gyb.test.singel;

/**
 * Description:
 *
 * @author GB
 * @date 2022/8/7 18:33
 */
public class SingleTwo {
    private static SingleTwo SINGLE_TWO = null;

    private SingleTwo() {

    }


    public static SingleTwo getSingleTwo() {
        if (SINGLE_TWO == null) {
            synchronized (SingleTwo.class){
                if(SINGLE_TWO == null){
                    SINGLE_TWO = new SingleTwo();
                }
            }
        }
        return SINGLE_TWO;

    }


}
