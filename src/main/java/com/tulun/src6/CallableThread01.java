package com.tulun.src6;

import java.util.concurrent.Callable;

/**
 * @author:liguozheng
 * @Date:2018/12/18
 * @time:19:18
 * @description:
 */
@SuppressWarnings("all")
public class CallableThread01 implements Callable<Integer> {

    /**
     * 实现Callable接口
     * 实现call方法
     * 可以提供返回值，会有异常抛出
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        System.out.println("CallableThread ....");
        return 666;
    }

}
