package com.tulun.src6;

/**
 * @author:liguozheng
 * @Date:2018/12/18
 * @time:19:44
 * @description:
 */
@SuppressWarnings("all")
public class ThreadMethod01 {

    public static void main(String[] args) {

        //start() 启动一个线程，需要被首先调用，而且不能重复调用


        //run() 新线程启动之后会调用run方法，可以重复调用

        RunnableThread01 runnableThread01 = new RunnableThread01();
        new Thread(runnableThread01,"runnable ----1").start();

    }
}
