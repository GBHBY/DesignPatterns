package com.gyb.singel;

/**
 * Description:
 *
 * @author GB
 * @date 2022/7/21 19:10
 */
public class Main {


    public static void main(String[] args) {
        SingletonFour singletonFour = SingletonFour.getInstance();
        SingletonFour singletonFour1 = SingletonFour.getInstance();
        System.out.println(singletonFour1==singletonFour);
    }


}
