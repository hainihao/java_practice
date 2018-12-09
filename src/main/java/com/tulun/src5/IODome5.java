package com.tulun.src5;

import java.io.*;

/**
 * @author:liguozheng
 * @Date:2018/12/4
 * @time:19:06
 * @description:
 */
@SuppressWarnings("all")
public class IODome5 {

    public static void main(String[] args) throws IOException {

        String path = "/Users/liguozheng/Documents/Linux/nibuhao.txt";
        randomFile(path,"sadasdasdasdaea");
        inster(3,path,"99999");



    }

    public static void randomFile(String path,String conten){

        RandomAccessFile randomAccessFile;

        try {
            randomAccessFile = new RandomAccessFile(path,"rw");
            long index1 = randomAccessFile.length();
            randomAccessFile.seek(index1);
            randomAccessFile.write(conten.getBytes());
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inster(int index,String path,String conten) {

        RandomAccessFile randomAccessFile = null;
        File tempFile;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {

            int len;
            randomAccessFile = new RandomAccessFile(path,"rw");
            tempFile = File.createTempFile("temp.txt",null);
            fileInputStream = new FileInputStream(tempFile);
            fileOutputStream = new FileOutputStream(tempFile);

            tempFile.deleteOnExit();
            randomAccessFile.seek(index);

            while ((len = randomAccessFile.read())!=-1){
                fileOutputStream.write(len);
            }

            randomAccessFile.seek(index);
            randomAccessFile.write(conten.getBytes());

            while ((len = fileInputStream.read() )!=-1){
                randomAccessFile.write(len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
