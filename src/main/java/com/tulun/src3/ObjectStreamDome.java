package com.tulun.src3;

import java.io.*;

/**
 * @author:liguozheng
 * @Date:2018/11/28
 * @time:21:10
 * @description:
 */

public class ObjectStreamDome {


    public static void main(String[] args) {

        String path = "/Users/liguozheng/Documents/Linux/test1.txt";
      //  objectOutPutTest(path);
        objectTest(path);
    }

    public static void objectTest(String path){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            int o ;
            long start = System.currentTimeMillis();
            while ((o = objectInputStream.read())!=-1){
                System.out.print(o);
            }
            long end = System.currentTimeMillis();
            System.out.println();
            System.out.println();
            System.out.println(end - start);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void objectOutPutTest(String path){

        try {
            Student1802 s1 = new Student1802("张三",23,"男");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
