package com.tulun.src6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

    }
}

class thread1 implements Runnable {



    @Override
    public void run() {

    }
}


@Getter
@Setter
@ToString
class Student{

    private int id;
    private String name;
    private int age;
    private int[] score;

    public Student() {
        this(7);
    }

    private Student(int size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = new int[size];
    }

}