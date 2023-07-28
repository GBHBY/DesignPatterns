package com.gyb.templateMethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gb
 * @version 1.0
 * description:模板方法
 * @date 2021/8/15 18:13
 */
@Slf4j
public class TemplateMethod {
    public static void main(String[] args) {
        Father sun = new EldestSon();
        sun.marry();
        Father second = new SecondSon();
        second.marry();
    }

}
@Slf4j
abstract class Father {
    public void marry() {
        findGirlFriend();
        holdingHands();
        getMarried();
    }

    void holdingHands(){
     log.info("牵女孩的手见父母");
    }

    abstract void findGirlFriend();

    abstract void getMarried();


}

@Slf4j
class EldestSon extends Father {

    @Override
    void findGirlFriend() {
        log.info("大儿子找到了女朋友");
    }

    @Override
    void getMarried() {
        log.info("大儿子结婚了");
    }
}

@Slf4j
class SecondSon extends Father{

    @Override
    void findGirlFriend() {
        log.info("二儿子找到了女朋友");
    }

    @Override
    void getMarried() {
        log.info("二儿子结婚了");
    }
}