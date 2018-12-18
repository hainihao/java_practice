package com.tulun.src6;

/**
 * @author:liguozheng
 * @Date:2018/12/18
 * @time:19:13
 * @description:
 */

public class ExtendsThread01 extends Thread{

    @Override
    public synchronized void start() {
        System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getId());
    }
}
