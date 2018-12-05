package com.tulun.src4;

import java.io.*;

/**
 * @author:liguozheng
 * @Date:2018/12/1
 * @time:11:48
 * @description:
 */

public class RamdonFileDome {

    public static void main(String[] args) {

        String path = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
   //     inPut(path);
        //reader(path);
    }

    public static void reader(String path){

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(path,"r");
            long filePointer = randomAccessFile.getFilePointer();
            System.out.println(filePointer);
            long length = randomAccessFile.length();
            System.out.println(length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inPut(String path) throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(path,"rw");
        try {
            randomAccessFile.write(97);
            randomAccessFile.write(98);
            randomAccessFile.write(99);
            randomAccessFile.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
