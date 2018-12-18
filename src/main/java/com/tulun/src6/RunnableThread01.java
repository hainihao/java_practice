package com.tulun.src6;

/**
 * @author:liguozheng
 * @Date:2018/12/18
 * @time:19:25
 * @description:
 */

public class RunnableThread01 implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"  " +Thread.currentThread().getId());
    }
}