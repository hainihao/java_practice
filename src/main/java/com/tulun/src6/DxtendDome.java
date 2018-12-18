package com.tulun.src6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author:liguozheng
 * @Date:2018/12/7
 * @time:21:27
 * @description:
 */
@SuppressWarnings("all")
public class DxtendDome {

    public static void main(String[] args) throws ExecutionException{

        RunnableThread01 runableThread01 = new RunnableThread01();
        Thread thread = new Thread(runableThread01);
        thread.start();
        System.out.println("main thread ...");

        ExtendsThread01 extendsThread01 = new ExtendsThread01();
        extendsThread01.start();

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        CallableThread01 callableThread01 = new CallableThread01();
//        Future<Integer> submit = executorService.submit(callableThread01);
//        Integer integer = null;
//        try {
//            integer = submit.get();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(integer);
    }

}

