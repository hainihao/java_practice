package com.tulun.src6;

/**
 * @author:liguozheng
 * @Date:2018/12/7
 * @time:21:27
 * @description:
 */

public class DxtendDome {

    public static void main(String[] args) {
        dome1();

    }

    public static void dome1(){
        Runnable runnable = () -> System.out.println("nihap");
        runnable.run();
    }
}
