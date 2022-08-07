package com.gyb.templateMethod;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gb
 * @version 1.0
 * description:模板方法
 * @date 2021/8/15 18:13
 */

public class TemplateMethod {
    public static void main(String[] args) {
        Father sun = new Sun();
        sun.start();
    }

}

abstract class Father {
    public void start() {
        run();
        smile();

    }

    abstract void run();

    abstract void smile();


}

class Sun extends Father {

    @Override
    void run() {

    }

    @Override
    void smile() {

    }
}
