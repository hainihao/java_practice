package com.tulun.src3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author:liguozheng
 * @Date:2018/11/28
 * @time:21:10
 * @description:
 */

public class ObjectStreamDome {

    public static void main(String[] args) {

    }
    public static void objectTest(String path){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            int len ;
            while ((len = objectInputStream.readChar())!=-1){
                System.out.println((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
