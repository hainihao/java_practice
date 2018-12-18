package com.tulun.src6;

import org.junit.Test;

import java.util.Random;

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

        //线程让步，可以让当前正在执行的线程暂停，让位于优先级较高的线程,静态方法
        //Thread.yield();

        //sleep() 是Thread类的静态方法，让线程睡眠，会有异常   InterruptedException

        //join() 等待,谁启动谁先行。其他线程会等待该线程完成    线程会有异常 InterruptedException
        System.out.println("asdas");
        RunnableThread01 runnableThread01 = new RunnableThread01();
        Thread thread = new Thread(runnableThread01, "runnable ----1");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("fnasofn");

    }

    @Test
    public void test() {

        RunnableThread01 runnableThread01 = new RunnableThread01();
        RunnableThread01 runnableThread011 = new RunnableThread01();
        RunnableThread01 runnableThread012 = new RunnableThread01();
        Thread thread = new Thread(runnableThread01,"t1");
        Thread thread1 = new Thread(runnableThread011,"t2");
        Thread thread2 = new Thread(runnableThread012,"t3");

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
