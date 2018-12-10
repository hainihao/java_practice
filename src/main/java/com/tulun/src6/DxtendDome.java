package com.tulun.src6;

import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;
import lombok.ToString;

import java.util.concurrent.locks.Lock;

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


@ToString
class Student{

    private int id;
    private String name;
    private int age;
    private int[] score;
    private Lock stuLock;

    public Student() {
        this(7);
    }

    private Student(int size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = new int[size];
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getScore() {
        return score;
    }

    public synchronized void setScore(int[] score) {
        this.score = score;
    }

    public Lock getStuLock() {
        return stuLock;
    }

    public void setStuLock(Lock stuLock) {
        this.stuLock = stuLock;
    }
}